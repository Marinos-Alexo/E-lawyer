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
public class Create_Yp extends javax.swing.JFrame {
 Connection con1 ;
        PreparedStatement pst;
        ResultSet rs;
    int  mousepX,mousepY;
    public Create_Yp() {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_perigrafi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtimerominia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_antidikos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_arprt = new javax.swing.JTextField();
        CBdikaio = new javax.swing.JComboBox<>();
        CBLista_Dik = new javax.swing.JComboBox<>();
        CBkatastasi = new javax.swing.JComboBox<>();
        CreateCase = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CB_pel = new javax.swing.JComboBox<>();

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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Αριθμός Πρωτοκόλλου:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
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
        jLabel12.setText("Υπεύθυνος Δικηγόρος:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Δίκαιο:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txt_perigrafi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perigrafiActionPerformed(evt);
            }
        });
        jPanel1.add(txt_perigrafi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 340, 110));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Περιγραφή Υπόθεσης:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ημερομηνία Δίκης:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtimerominia.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtimerominia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimerominiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtimerominia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Αντίδικος:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        txt_antidikos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txt_antidikos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 180, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/Logo-3.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 240));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Κατάσταση:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        txt_arprt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txt_arprt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 40));

        CBdikaio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CBdikaio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Χωρίς Δίκαιο", "Εμπορικό", "Αστικό", "Ποινικό" }));
        jPanel1.add(CBdikaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, -1));

        CBLista_Dik.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CBLista_Dik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - -", "" }));
        CBLista_Dik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBLista_DikMouseClicked(evt);
            }
        });
        jPanel1.add(CBLista_Dik, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 240, 40));

        CBkatastasi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CBkatastasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - -", "Ενεργή" }));
        jPanel1.add(CBkatastasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 30));

        CreateCase.setBackground(new java.awt.Color(0, 51, 153));
        CreateCase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreateCase.setText("Ολοκλήρωση");
        CreateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCaseActionPerformed(evt);
            }
        });
        jPanel1.add(CreateCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 150, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Δημιουργία Υπόθεσης");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Πελάτης:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        CB_pel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CB_pel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Χωρίς Επιλογή" }));
        CB_pel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_pelMouseClicked(evt);
            }
        });
        jPanel1.add(CB_pel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

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
        Dikigoriko_Grafeio m = new Dikigoriko_Grafeio();
        m.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void txt_perigrafiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perigrafiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perigrafiActionPerformed

    private void txtimerominiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimerominiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimerominiaActionPerformed

    private void CreateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCaseActionPerformed
        String dikaio = CBdikaio.getSelectedItem().toString();
         String yp_dik = CBLista_Dik.getSelectedItem().toString();
          String katastasi = CBkatastasi.getSelectedItem().toString();
        String ar_prwtokollou = txt_arprt.getText();
        String imerominia = txtimerominia.getText();
        String perigrafi = txt_perigrafi.getText();
        String antidikos = txt_antidikos.getText();
        String pelatis = CB_pel.getSelectedItem().toString();
      
           if (ar_prwtokollou.equals("") ||  imerominia.equals("") || perigrafi.equals("") || antidikos.equals("") || dikaio.equals("Χωρίς Δίκαιο") || yp_dik.equals("- - - -") || katastasi.equals("- - - -"))
            {
             JOptionPane.showMessageDialog(null,"Λάθος Στοιχεία","Error",JOptionPane.ERROR_MESSAGE);
             txt_arprt.setText("");
             txtimerominia.setText("");
             txt_perigrafi.setText("");
             txt_antidikos.setText("");
            }
           
             
              
            try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("insert into ypothesi(ar_prwtokollou,yp_dik,imerominia,dikaio,perigrafi,antidikos,katastasi,pelatis)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, ar_prwtokollou);
            pst.setString(2, yp_dik);
            pst.setString(3, imerominia);
            pst.setString(4, dikaio);
            pst.setString(5, perigrafi);
            pst.setString(6, antidikos);
            pst.setString(7, katastasi);
            pst.setString(8, pelatis);
            pst.executeUpdate();
            
           
            
           JOptionPane.showMessageDialog(this,"Η Υπόθεση προστέθηκε");
            
           
        } 
             catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
         } 
         try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("insert into timer(ar_prwtokollou_t,wres)values(?,?)");     
             pst.setString(1, ar_prwtokollou);
             pst.setInt(2,0);
          } 
             catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateCaseActionPerformed

    private void CBLista_DikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBLista_DikMouseClicked
       if(CBdikaio.getSelectedItem().equals("Αστικό")) {
        try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from dikigoros where eidikotita like 'Αστικό'");
             ResultSet rs = pst.executeQuery();
               while(rs.next())
           {
              CBLista_Dik.addItem(rs.getString("username_dikigoros")); 
           }
    }//GEN-LAST:event_CBLista_DikMouseClicked
catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
  if(CBdikaio.getSelectedItem().equals("Εμπορικό")) {
        try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from dikigoros where eidikotita like 'Εμπορικό'");
             ResultSet rs = pst.executeQuery();
               while(rs.next())
           {
              CBLista_Dik.addItem(rs.getString("username_dikigoros")); 
           }
    }                                     
    catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
         }
   }     
  if(CBdikaio.getSelectedItem().equals("Ποινικό")) {
        try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from dikigoros where eidikotita like 'Ποινικό'");
             ResultSet rs = pst.executeQuery();
               while(rs.next())
           {
              CBLista_Dik.addItem(rs.getString("username_dikigoros")); 
           }
    }                                     
    catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
         }
   }     
    if(CBdikaio.getSelectedItem().equals("Χωρίς Δίκαιο")) {    
       
       JOptionPane.showMessageDialog(null,"Πρώτα Επιλέξτε Δίκαιο","Error",JOptionPane.ERROR_MESSAGE); 
          
    } 
    }
    private void CB_pelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_pelMouseClicked
       try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from pelatis");
             ResultSet rs = pst.executeQuery();
               while(rs.next())
           {
              CB_pel.addItem(rs.getString("username_pelatis")); 
           }
    }                                     
catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Create_Yp.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_CB_pelMouseClicked
  
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
            java.util.logging.Logger.getLogger(Create_Yp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Yp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Yp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Yp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Create_Yp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBLista_Dik;
    private javax.swing.JComboBox<String> CB_pel;
    private javax.swing.JComboBox<String> CBdikaio;
    private javax.swing.JComboBox<String> CBkatastasi;
    private javax.swing.JButton CreateCase;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_antidikos;
    private javax.swing.JTextField txt_arprt;
    private javax.swing.JTextField txt_perigrafi;
    private javax.swing.JTextField txtimerominia;
    // End of variables declaration//GEN-END:variables
}
