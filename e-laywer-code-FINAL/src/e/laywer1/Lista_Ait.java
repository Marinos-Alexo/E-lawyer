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
public class Lista_Ait extends javax.swing.JFrame {
Connection con1 ;
        PreparedStatement pst;
        ResultSet rs;
    int  mousepX,mousepY;
    public Lista_Ait(String username) {
        initComponents();
        user.setText(username);
       user.setVisible(false);  
       LipsiAitimatwn();
    }

    
    
    private void LipsiAitimatwn()
   {
     String dikigoros=user.getText();
    int c;
     try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from aitimata where username_dik=?  ");
             pst.setString(1, dikigoros);
           ResultSet rs = pst.executeQuery();
           ResultSetMetaData Rss = rs.getMetaData();
           c = Rss.getColumnCount();
           
           DefaultTableModel Df = (DefaultTableModel)Lista_Aitimatwn.getModel();
           Df.setRowCount(0);
           
           while(rs.next())
           {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                v2.add(rs.getString("perigrafi"));
                   v2.add(rs.getString("imerominia"));
                      v2.add(rs.getString("wra"));
                   v2.add(rs.getString("username_pel"));    
                   }
              Df.addRow(v2);
                }
         } 
          catch (ClassNotFoundException ex) {
            Logger.getLogger(Lista_Ait.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Lista_Ait.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Aitimatwn = new javax.swing.JTable();
        Accept = new javax.swing.JButton();
        user = new javax.swing.JLabel();

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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_exit_50px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/Logo-3.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 240));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Λίστα Αιτημάτων");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        Lista_Aitimatwn.setAutoCreateRowSorter(true);
        Lista_Aitimatwn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Περιγραφή", "Ημερομηνια", "Ώρα", "Πελάτης"
            }
        ));
        Lista_Aitimatwn.setSelectionBackground(new java.awt.Color(0, 51, 204));
        jScrollPane1.setViewportView(Lista_Aitimatwn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 550, 230));

        Accept.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Accept.setText("Αποδοχή");
        Accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceptMouseClicked(evt);
            }
        });
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });
        jPanel1.add(Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        user.setText("jLabel2");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

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
       Calendar m = new Calendar(user.getText());
        m.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptActionPerformed

    private void AcceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptMouseClicked
       DefaultTableModel Df = (DefaultTableModel) Lista_Aitimatwn.getModel();
         int selectedIndex =  Lista_Aitimatwn.getSelectedRow();
          String dikigoros=user.getText();
          String perigrafi = Lista_Aitimatwn.getModel().getValueAt(selectedIndex, 0).toString();
          String imerominia = Lista_Aitimatwn.getModel().getValueAt(selectedIndex, 1).toString();
          String wra = Lista_Aitimatwn.getModel().getValueAt(selectedIndex, 2).toString();
          String pelatis = Lista_Aitimatwn.getModel().getValueAt(selectedIndex, 3).toString();
        try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from event where username_dik=? and imerominia=? and wra=? ");
             pst.setString(1, dikigoros);
             pst.setString(2, imerominia);
             pst.setString(3, wra);
            ResultSet rs = pst.executeQuery();
             if(rs.next())
             {
              pst = con1.prepareStatement("delete * from aitimata where username_dik=? and imerominia=? and wra=? and perigrafi=? and username_pel=? ");
               pst.setString(1, dikigoros);
             pst.setString(2, imerominia);
             pst.setString(3, wra);
               pst.setString(4, perigrafi);
             pst.setString(5, pelatis);
             pst.executeUpdate();
               JOptionPane.showMessageDialog(this,"Το αίτημα απορρίφθηκε");
             }
        else
             {
                 pst = con1.prepareStatement("insert into event(username_dik,perigrafi,imerominia,wra,username_pel)values(?,?,?,?,?)");
               pst.setString(1, dikigoros);
              pst.setString(2, perigrafi);
            pst.setString(3, imerominia);
            pst.setString(4, wra);
            pst.setString(5, pelatis);
             pst.executeUpdate();
             
             
              pst = con1.prepareStatement("delete * from aitimata where username_dik=? and imerominia=? and wra=? and perigrafi=? and username_pel=? ");
               pst.setString(1, dikigoros);
             pst.setString(2, imerominia);
             pst.setString(3, wra);
               pst.setString(4, perigrafi);
             pst.setString(5, pelatis);
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this,"Το Event προστέθηκε");
              LipsiAitimatwn();
             }
        
        }
        
          
          catch (ClassNotFoundException ex) {
            Logger.getLogger(Lista_Ait.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Lista_Ait.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_AcceptMouseClicked

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
            java.util.logging.Logger.getLogger(Lista_Ait.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Ait.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Ait.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Ait.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_Ait("user").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JTable Lista_Aitimatwn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
