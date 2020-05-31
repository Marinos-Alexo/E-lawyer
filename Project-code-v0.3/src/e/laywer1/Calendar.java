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
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ΜΑΡΙΝΟΣ
 */
public class Calendar extends javax.swing.JFrame {
Connection con1 ;
        PreparedStatement pst;
        ResultSet rs;
    int  mousepX,mousepY;
    public Calendar(String username) {
        initComponents();
         user.setText(username);
       user.setVisible(false);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SelectDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        CalendarTable = new javax.swing.JTable();
        DeleteEvent = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        GetListaEvent = new javax.swing.JLabel();

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
        jLabel3.setText("Calendar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Προσθήκη Event");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 190, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Αιτήματα για Ραντεβού");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Διάλεξε Ημερομηνία:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        SelectDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectDateMouseClicked(evt);
            }
        });
        jPanel1.add(SelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, 30));

        CalendarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Events", "Ώρα", "Πελάτης"
            }
        ));
        jScrollPane1.setViewportView(CalendarTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 510, 90));

        DeleteEvent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteEvent.setText("Διαγραφή");
        DeleteEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteEventMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, 40));

        user.setText("user");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        GetListaEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/laywer1/icons8_search_40px.png"))); // NOI18N
        GetListaEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GetListaEventMouseClicked(evt);
            }
        });
        jPanel1.add(GetListaEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 50));

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
        Dikigoros m = new Dikigoros(user.getText());
        m.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
        Create_Ev m = new Create_Ev(user.getText());
        m.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
         this.dispose();
        Lista_Ait m = new Lista_Ait(user.getText());
        m.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked
 private void table_update(){
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       String date = sdf.format(SelectDate.getDate() );
        int c;
       try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from event where username_dik= ? and imerominia=? ");
            pst.setString(1, user.getText());
            pst.setString(2, date);
            
           ResultSet rs = pst.executeQuery();
           ResultSetMetaData Rss = rs.getMetaData();
           c = Rss.getColumnCount();
           
           DefaultTableModel Df = (DefaultTableModel)CalendarTable.getModel();
           Df.setRowCount(0);
           
           
           while(rs.next())
           {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                
                   v2.add(rs.getString("id_event"));
                       v2.add(rs.getString("perigrafi"));
                           v2.add(rs.getString("wra"));
                               v2.add(rs.getString("username_pel"));
                   }
              Df.addRow(v2);
               
           }
         
                 
            
        
        } 
           
               
         catch (ClassNotFoundException ex) {
            Logger.getLogger(Lista_Pelatwn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Lista_Pelatwn.class.getName()).log(Level.SEVERE, null, ex);
         } 
     
     
     
 }
    private void SelectDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectDateMouseClicked
      
    }//GEN-LAST:event_SelectDateMouseClicked

    private void GetListaEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetListaEventMouseClicked
     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       String date = sdf.format(SelectDate.getDate() );
        int c;
       try {
            Class.forName("java.sql.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("select * from event where username_dik= ? and imerominia=? ");
            pst.setString(1, user.getText());
            pst.setString(2, date);
            
           ResultSet rs = pst.executeQuery();
           ResultSetMetaData Rss = rs.getMetaData();
           c = Rss.getColumnCount();
           
           DefaultTableModel Df = (DefaultTableModel)CalendarTable.getModel();
           Df.setRowCount(0);
           
           
           while(rs.next())
           {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                
                   v2.add(rs.getString("id_event"));
                       v2.add(rs.getString("perigrafi"));
                           v2.add(rs.getString("wra"));
                               v2.add(rs.getString("username_pel"));
                   }
              Df.addRow(v2);
               
           }
         
                 
            
        
        } 
           
               
         catch (ClassNotFoundException ex) {
            Logger.getLogger(Lista_Pelatwn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Lista_Pelatwn.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_GetListaEventMouseClicked

    private void DeleteEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteEventMouseClicked
         DefaultTableModel Df = (DefaultTableModel) CalendarTable.getModel();
         int selectedIndex =  CalendarTable.getSelectedRow();
         
          try {
             
              int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            
              int dialogResult = JOptionPane.showConfirmDialog(null,"Θέλετε να διαγράψετε το Event?","Warning",JOptionPane.YES_NO_OPTION);
              
              if(dialogResult == JOptionPane.YES_OPTION)
              {   
        
             Class.forName("java.sql.Driver");
             
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/e_lawyer?useUnicode=yes&characterEncoding=UTF-8","root","");
            pst = con1.prepareStatement("delete from event where id_event=? ");
            
            pst.setInt(1,id );
            
            pst.executeUpdate();
            
           JOptionPane.showMessageDialog(this,"To Event διαγράφηκε");
            
            table_update(); 
            
            
        } 
          }   
               
         catch (ClassNotFoundException ex) {
            Logger.getLogger(Lista_Pelatwn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Lista_Pelatwn.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }//GEN-LAST:event_DeleteEventMouseClicked

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
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Calendar("user").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CalendarTable;
    private javax.swing.JButton DeleteEvent;
    private javax.swing.JLabel GetListaEvent;
    private com.toedter.calendar.JDateChooser SelectDate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
