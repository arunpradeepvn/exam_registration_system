package javaapplication1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class loginForm extends javax.swing.JFrame {
    public loginForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EXAMINATION REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 40, 280, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 170, 90, 25);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(320, 170, 222, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 220, 90, 25);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(120, 270, 167, 33);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 330, 127, 33);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 330, 127, 33);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setText("Sign up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 390, 127, 33);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 390, 127, 33);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton5.setText("Forget password");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 270, 193, 33);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("User Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(66, 110, 107, 25);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(320, 220, 222, 31);

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setText("Admin Login");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(510, 110, 79, 17);
        jButton6.getAccessibleContext().setAccessibleName("Admin Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //reset-clear
        jTextField1.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //For show and hide password in password Field
        if ( jPasswordField1.getEchoChar() != '\u0000' ){
            jPasswordField1.setEchoChar('\u0000');
        }
        else{
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //getting username and password
        String userValue = jTextField1.getText();
        int passValue = jPasswordField1.getText().hashCode();
        try{
            //DB Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examregistration","root","");
            //Statement Creation
            Statement st = con.createStatement();
            //Retrive data   
            PreparedStatement pst = con.prepareStatement("select * from users where username=?");
            pst.setString (1,userValue);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                //check user entered password and db password is equal
                if (passValue == (rs.getInt ("passcode"))){
                    //To Store Date and Time of User Login
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = new Date();
                    String time = formatter.format(date);
                    st.execute("insert into login values('"+userValue+"','"+time+"')");
                    //Personal Data Registration  
                    dataRegistration dataRegistration = new dataRegistration();
                    dataRegistration.dataRegistration0(userValue);
                    dispose();
                    dataRegistration.setVisible(true);  
                    dataRegistration.setSize(1000,1000);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Password"); 
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Username"); 
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    //call sign-up page  
       signup signup = new signup();
       signup.setVisible(true);
       signup.setSize(1000,1000);
       dispose();    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        //trim
        jTextField1.setText(jTextField1.getText().trim());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Calling Forgot Password Form
        dispose();
        forgotpassword forgotpassword = new forgotpassword();
        forgotpassword.setVisible(true);
        forgotpassword.setSize(1000,1000);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Admin Login
        dispose();
        adminlogin adminlogin = new adminlogin();
        adminlogin.setVisible(true);
        adminlogin.setSize(1000,1000);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new loginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    protected javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
