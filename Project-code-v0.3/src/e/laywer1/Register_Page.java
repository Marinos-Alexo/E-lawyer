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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ΜΑΡΙΝΟΣ
 */
public class Register_Page extends javax.swing.JFrame {
Connection con1 ;
        PreparedStatement pst;
        ResultSet rs;
    int  mousepX,mousepY;
    public Register_Page() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        onoma_pel = new javax.swing.JTextField();
        epwnimo_pel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_poli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_street = new javax.swing.JTextField();
        checkbox1 = new java.awt.Checkbox();
        jLabel7 = new javax.swing.JLabel();
        checkbox2 = new java.awt.Checkbox();
        jLabel8 = new javax.swing.JLabel();
        txt_afm = new javax.swing.JTextField();

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_back_arrow_50px_2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Επώνυμο:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 40));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 180, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_exit_50px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Τηλέφωνο:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Όνομα:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 180, 40));

        onoma_pel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoma_pelActionPerformed(evt);
            }
        });
        jPanel1.add(onoma_pel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 40));

        epwnimo_pel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epwnimo_pelActionPerformed(evt);
            }
        });
        jPanel1.add(epwnimo_pel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_submit_resume_60px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Πόλη:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        txt_poli.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_poli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_poliActionPerformed(evt);
            }
        });
        jPanel1.add(txt_poli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 180, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Διεύθυνση:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        txt_street.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txt_street, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 40));

        checkbox1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        checkbox1.setForeground(new java.awt.Color(255, 255, 255));
        checkbox1.setLabel("I Agree with Politcal Terms"); // NOI18N
        jPanel1.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 280, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/Logo-3.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -10, -1, 240));

        checkbox2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        checkbox2.setForeground(new java.awt.Color(255, 255, 255));
        checkbox2.setLabel("I am not a Robot");
        jPanel1.add(checkbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ΑΦΜ:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        txt_afm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txt_afm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 600));

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
        StartPage m = new StartPage();
        m.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void onoma_pelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoma_pelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onoma_pelActionPerformed

    private void epwnimo_pelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epwnimo_pelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epwnimo_pelActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         
    
        String onoma = onoma_pel.getText();
        String epwnimo = epwnimo_pel.getText();
        String email = txt_email.getText();
        String tilefwno = txt_phone.getText();
        String poli = txt_poli.getText();
        String street = txt_street.getText();
          String afm = txt_afm.getText();
      String username = txt_username.getText();
      String password = txt_password.getText();
      
              if (onoma.equals("") || epwnimo.equals("") || email.equals("") || tilefwno.equals("") || poli.equals("") || street.equals("") || afm.equals("")|| username.equals("") || password.equals(""))
            {
             JOptionPane.showMessageDialog(null,"Παρακαλώ συμπληρώστε όλα τα πεδία","Error",JOptionPane.ERROR_MESSAGE);
             onoma_pel.setText("");
             epwnimo_pel.setText("");
             txt_email.setText("");
             txt_phone.setText("");
             txt_poli.setText("");
             txt_street.setText("");
              txt_afm.setText("");
              txt_username.setText("");
             txt_password.setText("");
            }
           
             
              
            try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("insert into ypothesi(ar_prwtokollou,yp_dik,imerominia,dikaio,perigrafi,antidikos,katastasi,pelatis)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, onoma);
            pst.setString(2, epwnimo);
            pst.setString(3, email);
            pst.setString(4, tilefwno);
            pst.setString(5, poli);
            pst.setString(6, street);
            pst.setString(7, afm);
            pst.setString(8, username);
            pst.setString(9, password);
            pst.executeUpdate();
            
           
            
           JOptionPane.showMessageDialog(this,"Η εγγραφή σας ήταν επιτυχής");
            
           
        } 
             catch (ClassNotFoundException ex) {
            Logger.getLogger(Register_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register_Page.class.getName()).log(Level.SEVERE, null, ex);
         }    
        
        
        
        
        
        
        
        
        
        
        this.dispose();
         
     Forma_Ep m = new Forma_Ep();
        m.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txt_poliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_poliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_poliActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private javax.swing.JTextField epwnimo_pel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField onoma_pel;
    private javax.swing.JTextField txt_afm;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_poli;
    private javax.swing.JTextField txt_street;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
