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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ΜΑΡΙΝΟΣ
 */
public class PliroforiesYp extends javax.swing.JFrame {
Connection con1 ;
        PreparedStatement pst;
        ResultSet rs;
    int  mousepX,mousepY;
    public PliroforiesYp(int ar_ptr) {
        initComponents();
        user.setText(String.valueOf(ar_ptr));
       user.setVisible(false);
       getPlirofPel();
    }

    private void getPlirofPel()
    {
       
         String ar_ptr=user.getText();
           try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from ypothesi where ar_prwtokollou =? ");
            pst.setString(1, ar_ptr);
            
            
            rs = pst.executeQuery();
              
            while(rs.next())
           {
            txt_ar_ptr.setText(rs.getString("ar_prwtokollou"));
           txt_ypdik.setText(rs.getString("yp_dik"));
          txt_dikaio.setText(rs.getString("dikaio"));
          txt_imerominia.setText(rs.getString("imerominia"));
          txt_antidikos.setText(rs.getString("antidikos"));
           
           txt_pelatis.setText(rs.getString("pelatis_usr"));
           //txt_arxeio.setText(rs.getString("username_dikigoros"));
        
         txt_perigrafi.setText(rs.getString("perigrafi"));
           }
        
           
           
           
          
           }
         
                 
            
        
        
           
               
         catch (ClassNotFoundException ex) {
            Logger.getLogger(PliroforiesYp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(PliroforiesYp.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        txt_ar_ptr = new javax.swing.JLabel();
        txt_ypdik = new javax.swing.JLabel();
        txt_dikaio = new javax.swing.JLabel();
        txt_imerominia = new javax.swing.JLabel();
        txt_antidikos = new javax.swing.JLabel();
        txt_pelatis = new javax.swing.JLabel();
        txt_arxeio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_perigrafi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Υπέυθυνος Δικηγόρος:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ημερομηνία:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Αριθμός Πρωτοκόλλου:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Αρχείο:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Δίκαιο:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Αντίδικος");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Πελάτης:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 90, 40));

        txt_ar_ptr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_ar_ptr.setForeground(new java.awt.Color(204, 204, 204));
        txt_ar_ptr.setText(" ");
        jPanel1.add(txt_ar_ptr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 30));

        txt_ypdik.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_ypdik.setForeground(new java.awt.Color(204, 204, 204));
        txt_ypdik.setText(" ");
        jPanel1.add(txt_ypdik, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

        txt_dikaio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_dikaio.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_dikaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 40));

        txt_imerominia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_imerominia.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_imerominia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 40));

        txt_antidikos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_antidikos.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_antidikos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 200, 40));

        txt_pelatis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_pelatis.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_pelatis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 170, 40));

        txt_arxeio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_arxeio.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_arxeio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 170, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Περιγραφή:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txt_perigrafi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_perigrafi.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_perigrafi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 410, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_delete_50px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 570));

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(PliroforiesYp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PliroforiesYp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PliroforiesYp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PliroforiesYp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PliroforiesYp(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_antidikos;
    private javax.swing.JLabel txt_ar_ptr;
    private javax.swing.JLabel txt_arxeio;
    private javax.swing.JLabel txt_dikaio;
    private javax.swing.JLabel txt_imerominia;
    private javax.swing.JLabel txt_pelatis;
    private javax.swing.JLabel txt_perigrafi;
    private javax.swing.JLabel txt_ypdik;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
