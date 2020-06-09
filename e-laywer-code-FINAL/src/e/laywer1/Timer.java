
package e.laywer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author ΜΑΡΙΝΟΣ
 */
public class Timer extends javax.swing.JFrame  {
int timeRun=0;   
   
   Connection con1 ;
        PreparedStatement pst;
         ResultSet rs;
     int  mousepX,mousepY; 
    public Timer(String ar_ptr) {
        initComponents();
        timer.setText(ar_ptr);
        timer.setVisible(false);
    
        new Thread()
      {
         public void run()
         {
         while(timeRun==0)
         {
             Calendar cal= new GregorianCalendar();
          
             int hour=cal.get(Calendar.HOUR_OF_DAY);
             int min=cal.get(Calendar.MINUTE);
             int sec=cal.get(Calendar.SECOND);
            
             String time = hour + ":" + min + ":" + sec ;
         Clock.setText(time);
         }
         }
      }.start();
       
    }
   
 
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        ToggleTimer = new javax.swing.JButton();
        timer = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        wraSQL = new javax.swing.JLabel();
        StartTime = new javax.swing.JLabel();
        DurationTime = new javax.swing.JLabel();
        HoursTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToggleTimer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ToggleTimer.setText("Toggle Timer");
        ToggleTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToggleTimerMouseClicked(evt);
            }
        });
        ToggleTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleTimerActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        timer.setText("timer");
        jPanel1.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        Clock.setFont(new java.awt.Font("Digital-7 Mono", 1, 68)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("21:40:30");
        jPanel1.add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 90));
        jPanel1.add(wraSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, 20));
        jPanel1.add(StartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 20));
        jPanel1.add(DurationTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 30));
        jPanel1.add(HoursTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_delete_50px_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToggleTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleTimerActionPerformed
     
      
    }//GEN-LAST:event_ToggleTimerActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       mousepX = evt.getX();
         mousepY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int aX = evt.getXOnScreen();
        int aY = evt.getYOnScreen();
        
        this.setLocation(aX-mousepX,aY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
this.dispose();      
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ToggleTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToggleTimerMouseClicked
        String ar_ptr=timer.getText();
        if(ToggleTimer.getText().equals("Toggle Timer"))
       {
           
      try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from timer where ar_prwtokollou_t =? ");
            pst.setString(1, ar_ptr);
            
            
            rs = pst.executeQuery();
              
            while(rs.next())
           {
            wraSQL.setText(rs.getString("hours"));
          wraSQL.setVisible(false);
           }
 }
          catch (ClassNotFoundException ex) {
            Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
         } 

        String time_start=Clock.getText();
            StartTime.setText(time_start);
          StartTime.setVisible(false);
          ToggleTimer.setText("Stop");
       
       } 
          if(ToggleTimer.getText().equals("Stop"))
       {
          String time_stop=Clock.getText();
          SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		
          try {
              Date date1 = format.parse(StartTime.getText());
              Date date2 = format.parse(time_stop);
              double difference = date2.getTime() - date1.getTime();
              double duration=(difference/3600000);
              String s=String.valueOf(duration);
              DurationTime.setText(s);
            DurationTime.setVisible(false);
          } 
          catch (ParseException ex) {
              Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
          }
	double hours=Double.parseDouble(wraSQL.getText()) + Double.parseDouble(DurationTime.getText());
        HoursTime.setText(String.valueOf(hours));
        HoursTime.setVisible(false);
       
        try{
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst= con1.prepareStatement("update timer set hours= ? where ar_prwtokollou_t=?");
            pst.setDouble(1, hours);
             pst.setString(2,timer.getText() );
             pst.executeUpdate();
        
             JOptionPane.showMessageDialog(this,"Κλείστε το παράθυρο του Timer");
        
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
         
        } 
        
        
        
       }
    }//GEN-LAST:event_ToggleTimerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timer("ar_ptr").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel DurationTime;
    private javax.swing.JLabel HoursTime;
    private javax.swing.JLabel StartTime;
    private javax.swing.JButton ToggleTimer;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel wraSQL;
    // End of variables declaration//GEN-END:variables
}
