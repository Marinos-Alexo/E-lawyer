/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.laywer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Create_Aitima extends javax.swing.JFrame {
Connection con1 ;
        PreparedStatement pst;
        ResultSet rs;
    int  mousepX,mousepY;
    public Create_Aitima(String username) {
        initComponents();
          user.setText(username);
       user.setVisible(false);
    }

    private void GetListaDik ()
    {
     try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from ypothesi where pelatis_usr=?");
             pst.setString(1, user.getText());
             ResultSet rs = pst.executeQuery();
               while(rs.next())
           {
              CBgetDik.addItem(rs.getString("yp_dik")); 
           }
    }                                     
catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Ev.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Ev.class.getName()).log(Level.SEVERE, null, ex);
         }   
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time = new cambodia.raven.Time();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CreateAitima = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SelectDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtwra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtperigrafi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBgetDik = new javax.swing.JComboBox<>();
        user = new javax.swing.JLabel();

        time.setTextRefernce(txtwra);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-LAWYER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_back_arrow_50px_2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_exit_50px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/Logo-3.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 240));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Δημιουργία Αιτήματος");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        CreateAitima.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreateAitima.setText("Αποστολή Αιτήματος");
        CreateAitima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAitimaMouseClicked(evt);
            }
        });
        CreateAitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAitimaActionPerformed(evt);
            }
        });
        jPanel1.add(CreateAitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 210, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Διάλεξε Ημερομηνία:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel1.add(SelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Διάλεξε Ώρα:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txtwra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtwra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 130, 30));

        jButton1.setText("clock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 60, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Περιγραφή:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        txtperigrafi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtperigrafi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 250, 70));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Δικηγόρος:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        CBgetDik.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CBgetDik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Χωρίς επιλογή" }));
        CBgetDik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBgetDikMouseClicked(evt);
            }
        });
        jPanel1.add(CBgetDik, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 250, 50));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
         int aX = evt.getXOnScreen();
        int aY = evt.getYOnScreen();
        
        this.setLocation(aX-mousepX,aY-mousepY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
           mousepX = evt.getX();
         mousepY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       this.dispose();
        Proswpikes_Yp m = new Proswpikes_Yp(user.getText());
        m.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void CreateAitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAitimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateAitimaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        time.showPopup();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CreateAitimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAitimaMouseClicked
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       String date = sdf.format(SelectDate.getDate() );
       String perigrafi= txtperigrafi.getText();
       String wra=txtwra.getText();
        String dikigoros = CBgetDik.getSelectedItem().toString();
        
         if (txtperigrafi.equals("") ||  txtwra.equals("") || CBgetDik.equals("Χωρίς Δικηγόρο") )
            {
             JOptionPane.showMessageDialog(null,"Συμπληρώστε όλα τα στοιχεία","Error",JOptionPane.ERROR_MESSAGE);
             txtwra.setText("");
             txtperigrafi.setText("");
            }
           
             
              
            try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("insert into aitimata(username_pel,imerominia,wra,perigrafi,username_dik)values(?,?,?,?,?)");
            pst.setString(1, user.getText());
            pst.setString(2,date);
            pst.setString(3, wra);
            pst.setString(4, perigrafi);
            pst.setString(5, dikigoros);
            pst.executeUpdate();
            
           
            
           JOptionPane.showMessageDialog(this,"Το αίτημα στάλθηκε");
            this.dispose();
        Proswpikes_Yp m = new Proswpikes_Yp(user.getText());
        m.setVisible(true);
           
        } 
             catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Aitima.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Aitima.class.getName()).log(Level.SEVERE, null, ex);
         } 
       
    
    }//GEN-LAST:event_CreateAitimaMouseClicked

    private void CBgetDikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBgetDikMouseClicked
        
    }//GEN-LAST:event_CBgetDikMouseClicked

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
            java.util.logging.Logger.getLogger(Create_Aitima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Aitima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Aitima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Aitima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Aitima("user").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBgetDik;
    private javax.swing.JButton CreateAitima;
    private com.toedter.calendar.JDateChooser SelectDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private cambodia.raven.Time time;
    private javax.swing.JTextField txtperigrafi;
    private javax.swing.JTextField txtwra;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
