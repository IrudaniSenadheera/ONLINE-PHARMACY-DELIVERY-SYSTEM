/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.SignUp_1.male;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lihini
 */
public class SecurityQuestions extends javax.swing.JFrame {

    /**
     * Creates new form SecurityQuestions
     */
   
 

    public SecurityQuestions() {
        initComponents();
    }
    public void close()
    {
    WindowEvent closeWindow = new WindowEvent(this , WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
  
     
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jques1 = new javax.swing.JComboBox<>();
        jques2 = new javax.swing.JComboBox<>();
        jques3 = new javax.swing.JComboBox<>();
        jans1 = new javax.swing.JTextField();
        jans2 = new javax.swing.JTextField();
        jans3 = new javax.swing.JTextField();
        jsubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jOptionPane1.setMessage("You have not answered the security questions.Please fill the form .Or please click cancle to leave the page without signing up");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jques1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Question 1", "what is the name of your first pet?", "In what city were you born?", "What was your favourite food as you were child?" }));
        jques1.setMinimumSize(new java.awt.Dimension(240, 22));
        jques1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jques1ActionPerformed(evt);
            }
        });

        jques2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Question 2", "What was your dream job as a child?", "What was your childhood nickname?", "Who is your childhood best friend?" }));

        jques3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Question 3", "What is the birthmonth of your mother?", "Who was your childhood hero?", "What is your prefferd musical jounre?" }));

        jsubmit.setBackground(new java.awt.Color(0, 0, 102));
        jsubmit.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jsubmit.setForeground(new java.awt.Color(255, 255, 255));
        jsubmit.setText("Submit");
        jsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsubmitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel2.setText("Answer");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel3.setText("Answer");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel4.setText("Answer");

        txtmail.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        txtmail.setText("Email");

        txtemail.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("SECURITY QUESTIONS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jans1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jques1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jans2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jques2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jans3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jques3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jques1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jques2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jques3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jques1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jques1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jques1ActionPerformed

    private void jsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsubmitActionPerformed
       String q1= String.valueOf(jques1.getSelectedItem());
       String q2= String.valueOf(jques2.getSelectedItem());
       String q3= String.valueOf(jques3.getSelectedItem());
       String a1=jans1.getText();
       String a2=jans2.getText();
       String a3=jans3.getText();
       String mail=txtemail.getText();
      
       String gender;

        
        if(jques1.getSelectedIndex()==0||jques2.getSelectedIndex()==0||jques3.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(null, "Please choose one question from each");
        }
        else if(jans1.getText()==null||jans2.getText()==null||jans3.getText()==null){
        JOptionPane.showMessageDialog(null, "Please answer all questions");
        }
        
       
        else{
            
             if(SignUp_1.male.isSelected()){
        gender="male";
        }
        else{
        gender="female";
        }
           String fname=SignUp_1.txtFname.getText();
           String lname=SignUp_1.txtLname.getText();
           String nic=SignUp_1.txtNIC.getText();
           String email=SignUp_1.txtEmail.getText();
           String sex=gender;
           String address=SignUp_1.txtAddress.getText();
           String no=SignUp_1.txtNo.getText();
           String pword=SignUp_1.txtPassword.getText();
       try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/ phamacy","root","");  

Statement stmt1=con.createStatement();  
String query1="INSERT INTO customerdata(FirstName,LastName,NIC,Email,Gender,Address,ContactNo,Password) VALUES ('"+fname+"','"+lname+"','"+nic+"','"+email+"','"+sex+"','"+address+"','"+no+"','"+pword+"')";  
stmt1.executeUpdate(query1);

con.close();
         }
         catch(Exception e){ System.out.println(e);}
      
            
            
             try{  
                 
                 
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/ phamacy","root","");  

Statement stmt=con.createStatement();  
String query2="INSERT INTO security(Email,Q1,A1,Q2,A2,Q3,A3) VALUES ('"+mail+"','"+q1+"','"+a1+"','"+q2+"','"+a2+"','"+q3+"','"+a3+"')";  
stmt.executeUpdate(query2);
  
con.close();  

        
                

JOptionPane.showMessageDialog(null, "Successfully signup");

close();

Main m= new Main();
m.setVisible(true);

}catch(Exception e){ System.out.println(e);}
        }
    }//GEN-LAST:event_jsubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       close();
       SignUp_1 b = new SignUp_1();
       b.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityQuestions().setVisible(true);
            }
        }
        
        
        
        );
   
 
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField jans1;
    private javax.swing.JTextField jans2;
    private javax.swing.JTextField jans3;
    private javax.swing.JComboBox<String> jques1;
    private javax.swing.JComboBox<String> jques2;
    private javax.swing.JComboBox<String> jques3;
    public static javax.swing.JButton jsubmit;
    public static javax.swing.JTextField txtemail;
    private javax.swing.JLabel txtmail;
    // End of variables declaration//GEN-END:variables
}
