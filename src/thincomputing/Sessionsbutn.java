/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thincomputing;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author Sharvil
 */
public class Sessionsbutn extends javax.swing.JFrame {
String type,name;
int ni;

    /**
     * Creates new form Sessionsbutn
     */
    String abc[]= new String[2];
    public Sessionsbutn() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Sessions");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("           Session Name");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("           Type");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
        );

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 92, 0));
        jButton4.setForeground(java.awt.Color.black);
        jButton4.setText("X");
        jButton4.setToolTipText("Close Window");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try{ 
           
       newssn s = new newssn();
        s.main(abc);
       }
       catch(Exception e)
       {System.out.println(e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        DefaultListModel listModel = new DefaultListModel();
                        try {
                           ni=0;
                           int i= jList1.getSelectedIndex();
                           i=i+1;
                           System.out.println("selected:"+i);
                           int j=1;
                           ResultSet dl = stat.executeQuery("SELECT NO FROM SSN ORDER BY NO ASC;");
                           while(dl.next()&&j<=i)
                           {   

                               ni= dl.getInt(1);
                               j++;
                           }
                           System.out.println("delni:"+ni);
                           StringBuilder query = new StringBuilder() ; 
                            query.append("DELETE FROM SSN WHERE NO=").append(ni);
                            stat.execute(query.toString());
                            ResultSet rs = stat.executeQuery("SELECT * FROM SSN");
				
                                while (rs.next()) {
 
					int  no = rs.getInt(1);
					 name = rs.getString(2);
					 type = rs.getString(3);
                                        
                                        //add elements to list
                                        
                                        listModel.addElement("      "+name+"                                                           "+type);
                                        
                                        
					
				}
                                jList1.setModel(listModel);
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        DefaultListModel listModel = new DefaultListModel();
                        try {
			
                            ResultSet rs = stat.executeQuery("SELECT * FROM SSN");
				String name, type;
                                while (rs.next()) {
 
					int  no = rs.getInt(1);
					 name = rs.getString(2);
					 type = rs.getString(3);
                                        
                                        //add elements to list
                                        
                                        listModel.addElement("      "+name+"                                                           "+type);
                                        
                                        
					
				}
                                jList1.setModel(listModel);
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

@SuppressWarnings("empty-statement")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {   
                         
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        try {
                           ni=0;
                           int i= jList1.getSelectedIndex();
                           i=i+1;
                           System.out.println("selected:"+i);
                           int j=1;
                           ResultSet dl = stat.executeQuery("SELECT NO FROM SSN ORDER BY NO ASC;");
                           while(dl.next()&&j<=i)
                           {   

                               ni= dl.getInt(1);
                               j++;
                           }
                 
                           
                           //connecting to session         
                            
                           StringBuilder query = new StringBuilder() ; 
                            query.append("SELECT NAME,TYPE FROM SSN WHERE NO=").append(ni);
                           ResultSet cn= stat.executeQuery(query.toString());
                           while (cn.next()) {

					 name=cn.getString(1);
					 System.out.println(name);
                                         type = cn.getString(2);
                                         System.out.println(type);
                                         System.out.println(ni);
                                         
				}
                          
                      if(type.equals("rdesktop"))
                            {
                                abc[0]=name;
                                abc[1]=type;
                                editrdp.main(abc);
                                editrdp.rdpni=ni;
                               
                            }
                           
                      else if(type.equals("firefox"))
                           {
                               abc[0]=name;
                               abc[1]=type;
                               editfirefox.main(abc);
                               editfirefox.firefoxni=ni;
                           }
                      else if(type.equals("ica_wfc"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editica_wfcssn.main(abc);
                               editica_wfcssn.ica_wfcni=ni;
                      }
                      else if(type.equals("ica"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editicassn.main(abc);
                               editicassn.icani=ni;
                      }
                      
                       else if(type.equals("nx"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editnxssn.main(abc);
                               editnxssn.nxni=ni;
                      }
                      else if(type.equals("ssh"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editssh.main(abc);
                               editssh.sshni=ni;
                      }
                      else if(type.equals("qterm"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editqtermssn.main(abc);
                               editqtermssn.qtermni=ni;
                      }
                      else if(type.equals("vncviewer"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editvncssn.main(abc);
                               editvncssn.vncni=ni;
                      }
                      
                      else if(type.equals("xnest"))
                      {
                               abc[0]=name;
                               abc[1]=type;
                               editxnestssn.main(abc);
                               editxnestssn.xnestni=ni;
                      }
                      else System.out.println("no option to edit");
				
                      
                        cn.close();
			} catch (SQLException e) {
			};
                        
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (ClassNotFoundException | SQLException e)
        {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
                
              try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        
                        
                        DefaultListModel listModel = new DefaultListModel();
                        try {
				ResultSet rs = stat.executeQuery("SELECT * FROM SSN");
				String name, type;
                                while (rs.next()) {
 
					int  no = rs.getInt(1);
					 name = rs.getString(2);
					 type = rs.getString(3);
 
					//print query result to console
					System.out.println("no " + no);
					System.out.println("name " + name);
					System.out.println("type " + type);
                                        
                                        //add elements to list
                                        
                                        listModel.addElement("      "+name+"                                                           "+type);
                                        
                                        
					
				}
                                jList1.setModel(listModel);
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(Sessionsbutn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sessionsbutn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sessionsbutn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sessionsbutn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sessionsbutn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
