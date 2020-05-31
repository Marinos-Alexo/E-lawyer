
package e.laywer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ΜΑΡΙΝΟΣ
 */
public class Timer extends javax.swing.JFrame implements Runnable {
    Thread t;
    int hcnt=0,mcnt=0,scnt=0,mscnt=0;
   String str=" ",nstr=" ",mstr=" ",dstr=" ";
   int cnt=0,cnt2=0;
   Connection con1 ;
        PreparedStatement pst;
    public Timer(String ar_ptr) {
        initComponents();
        t= new Thread(this);
         reset();
          timer.setText(ar_ptr);
       timer.setVisible(false);
    }
    public void reset()
    {
        hcnt=0;mcnt=0;scnt=0;mscnt=0;cnt2=0;
        nstr="00:00:00";mstr="000";dstr="";
        display();
    }

  public void display() 
  {
      Disp1.setText(nstr);
      Disp2.setText(mstr);
  }
          
   public void setTimeCounter()
   {
       nstr="";
       if (hcnt<10)
       {
           nstr="0"+hcnt;
       }
       else{
           nstr=""+hcnt;
       }
   if(mcnt<10)
   {
       nstr+=":0"+mcnt;
   }
   else
   {
       nstr+=":"+mcnt;
   }
   if(scnt<10)
   {
       nstr+=":0"+scnt;
   }
   else
   {
       nstr+=":"+scnt;
   }
   }
 public void setMTimeCounter()
 {
     mstr="";
     if(mscnt<10)
     {
         mstr="00"+mscnt;
     }
     else if(mscnt>=10 && mscnt<100)
     {
         mstr="0"+mscnt;
     }
     else
     {
         mstr=""+mscnt;
     }
         }
  public void run()
  {
     try
     {
         while(true)
         {
          mscnt++;
          if(mscnt>999)
          {
          mscnt=0;
          scnt++;
          }
     if(scnt>59)
     {
         scnt=0;
         mcnt++;
     }
     if(mcnt>59)
     {
       mcnt=0;
       hcnt++;
     }
     if(hcnt>99)
     {
         reset();
     }
     setTimeCounter();
     setMTimeCounter();
     display();
     Thread.sleep(1);
         
         }
     }
     catch(Exception e){}
  }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        Disp1 = new javax.swing.JLabel();
        Disp2 = new javax.swing.JLabel();
        btnToggle = new javax.swing.JButton();
        timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Disp1.setFont(new java.awt.Font("Digital-7 Mono", 0, 70)); // NOI18N
        Disp1.setForeground(new java.awt.Color(255, 255, 255));
        Disp1.setText("00:00:00");
        jPanel1.add(Disp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 128));

        Disp2.setFont(new java.awt.Font("Digital-7 Mono", 0, 48)); // NOI18N
        Disp2.setForeground(new java.awt.Color(255, 255, 255));
        Disp2.setText("000");
        jPanel1.add(Disp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, 50));

        btnToggle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnToggle.setText("Toggle Timer");
        btnToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleActionPerformed(evt);
            }
        });
        jPanel1.add(btnToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        timer.setText("timer");
        jPanel1.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleActionPerformed
        if(btnToggle.getText().equals("Toggle Timer"))
        {
           btnToggle.setText("Stop");
           cnt++;
           if(cnt==1)
           {
           t.start();
           }
           else
           {
             t.resume();
           }
        }
        else 
        {
         btnToggle.setText("Toggle Timer");
        t.suspend();
        }
         if(btnToggle.getText().equals("Stop"))
         {
          String   wra=Disp1.getText();
           try {
                Class.forName("java.sql.Driver");
             
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst= con1.prepareStatement("update timer set wres= ? where ar_prwtokollou_t=? ");
            pst.setString(1, wra);
            pst.setString(2, timer.getText());
            
            
            pst.executeUpdate();
            } 
           
               
         catch (ClassNotFoundException ex) {
            Logger.getLogger( Timer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger( Timer.class.getName()).log(Level.SEVERE, null, ex);
         } 
           
   
         }
         
    }//GEN-LAST:event_btnToggleActionPerformed

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
    private javax.swing.JLabel Disp1;
    private javax.swing.JLabel Disp2;
    private javax.swing.JButton btnToggle;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables
}
