package javaapplication1;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class dataRegistration extends javax.swing.JFrame {

    public dataRegistration() {
        initComponents();
    }

    public String dataRegistration0(String userValue) {
       String username = userValue;
       jTextField5.setText(username);
       return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        birthdayEvaluator1 = new com.toedter.calendar.demo.BirthdayEvaluator();
        birthdayEvaluator2 = new com.toedter.calendar.demo.BirthdayEvaluator();
        birthdayEvaluator3 = new com.toedter.calendar.demo.BirthdayEvaluator();
        birthdayEvaluator4 = new com.toedter.calendar.demo.BirthdayEvaluator();
        birthdayEvaluator5 = new com.toedter.calendar.demo.BirthdayEvaluator();
        jDateChooserCellEditor1 = new com.toedter.calendar.JDateChooserCellEditor();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Details");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Examination Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Name of the Candidate");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Father's Name");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Mother's Name");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Gender");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("email ID");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Aadhar Number");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Date of Birth");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Mobile Number");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "MALE", "FEMALE", "TRANSGENDER" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel17.setText("Nationality");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "INDIAN", "OTHERS" }));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "10th", "12th", "UG", "PG", "Others" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setText("Qualification");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setText("Year of qualified");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel20.setText("Whether Employed");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "No", "Yes" }));
        jComboBox5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox5KeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setText("Current Institution Doing/Studying/Working");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Personal Details");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setToolTipText("");
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 460, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, 460, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, 460, Short.MAX_VALUE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, 460, Short.MAX_VALUE)
                            .addComponent(jTextField14))))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con;
                    try {
                        //DB connection
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examregistration","root","");
                        Statement st = con.createStatement();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        //Data from users
                        String name = jTextField1.getText();
                        String faname = jTextField2.getText();
                        String moname = jTextField3.getText();
                        String email = jTextField4.getText();
                        String aadhar = jTextField10.getText();
                        String dob = sdf.format(jDateChooser1.getDate());
                        String mobile = jTextField12.getText();
                        String gender = (String)jComboBox2.getSelectedItem();
                        String nationality = (String)jComboBox3.getSelectedItem();
                        String qualification = (String)jComboBox4.getSelectedItem();
                        String yearofqualified = jTextField13.getText();
                        String whetheremployed = (String)jComboBox5.getSelectedItem();
                        String currentinstitution = jTextField14.getText();
                        String username = jTextField5.getText();
                        if(name.isEmpty() != true && faname.isEmpty() != true && moname.isEmpty() != true && email.isEmpty() != true && aadhar.isEmpty() != true && dob.isEmpty() != true && mobile.isEmpty() != true && gender.isEmpty() != true && nationality.isEmpty() != true && qualification.isEmpty() != true && yearofqualified.isEmpty() != true && whetheremployed.isEmpty() != true && currentinstitution.isEmpty() != true && username.isEmpty() != true)  {
                            //store data into db                       
                            st.execute("insert into personaldetails values('"+name+"','"+faname+"','"+moname+"','"+email+"','"+aadhar+"','"+dob+"','"+mobile+"','"+gender+"','"+nationality+"','"+qualification+"','"+yearofqualified+"','"+whetheremployed+"','"+currentinstitution+"','"+username+"')");
                            Component panel = null;
                            JOptionPane.showMessageDialog(panel, "Successful", "Personal Details", JOptionPane.INFORMATION_MESSAGE);
                            dataRegistration1 dataRegistration1 = new dataRegistration1();
                            dataRegistration1.dataRegistration2(username);
                            dispose();
                            dataRegistration1.setVisible(true);
                            dataRegistration1.setSize(1000,1000);
                        }
                        else{
                            Component panel = null;
                            JOptionPane.showMessageDialog(panel, "Fill All Fields", "Personal Details", JOptionPane.ERROR_MESSAGE);
                      }
                    }                 
                    catch (java.sql.SQLException ex) {
                        System.out.println(ex);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       jTextField1.setText(jTextField1.getText().toUpperCase());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
       jTextField3.setText(jTextField3.getText().toUpperCase());
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
       jTextField4.setText(jTextField4.getText().toLowerCase());
       //trim
       jTextField4.setText(jTextField4.getText().trim());
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
       jTextField14.setText(jTextField14.getText().toUpperCase());
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
       jTextField2.setText(jTextField2.getText().toUpperCase());
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
       //Regular expression to accept valid email
       String email = jTextField4.getText();
       String regex1 = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
       if(email.matches(regex1) != true ){
            Component panel = null;
            JOptionPane.showMessageDialog(panel, "Invalid email", "Personal Details", JOptionPane.ERROR_MESSAGE);
            jTextField4.setText("");
       }
       //Regular expression to accept valid phone number      
       String mobile = jTextField12.getText().trim();
       jTextField12.setText(jTextField12.getText().trim());
       for(int i=0; i < mobile.length(); i++) {
            if(Character.isDigit(mobile.charAt(i)) && mobile.length()<11) {
            }
            else{
                Component panel = null;
                JOptionPane.showMessageDialog(panel, "Invalid Mobile Number", "Personal Details", JOptionPane.ERROR_MESSAGE);
                jTextField12.setText("");
                break;
            }
        }      
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        //Aadhar Validate
        String aadhar = jTextField10.getText().trim();
        jTextField10.setText(jTextField10.getText().trim());
        String strPattern = "^[2-9][0-9]{11}$";
        if(aadhar.length()>=12){
            if(aadhar.matches(strPattern) ){
            }
            else{
                Component panel = null;
                JOptionPane.showMessageDialog(panel, "Invalid Aadhar Number", "Personal Details", JOptionPane.ERROR_MESSAGE);
                jTextField10.setText("");
            }
        }
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
       //To validate year
        String qualified = jTextField13.getText().trim();
        jTextField13.setText(jTextField13.getText().trim());
        if(qualified.length()<5){
            if(qualified.matches("-?\\d+(\\.\\d+)?")){
                }
            else{
                Component panel = null;
                JOptionPane.showMessageDialog(panel, "Invalid Year", "Personal Details", JOptionPane.ERROR_MESSAGE);
                jTextField13.setText("");
            }
        }
        else{
            Component panel = null;
            JOptionPane.showMessageDialog(panel, "Invalid Year", "Personal Details", JOptionPane.ERROR_MESSAGE);
            jTextField13.setText("");
        }
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        
        Component panel = null;
        JOptionPane.showMessageDialog(panel, "Don't Change", "Personal Details", JOptionPane.ERROR_MESSAGE);
              
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        Component panel = null;
        JOptionPane.showMessageDialog(panel, "Don't Change", "Address Details", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jComboBox5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox5KeyPressed
       //validate qualification year
       /*if(jTextField13.getText().trim().length()==4)
       {
           
       }
       else
       {
            jTextField13.setText("");
            Component panel = null;
            JOptionPane.showMessageDialog(panel, "Invalid Year", "Personal Details", JOptionPane.ERROR_MESSAGE);
            
       }*/
    }//GEN-LAST:event_jComboBox5KeyPressed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new dataRegistration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator1;
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator2;
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator3;
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator4;
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator5;
    private javax.swing.JButton jButton1;
    protected javax.swing.JComboBox<String> jComboBox2;
    protected javax.swing.JComboBox<String> jComboBox3;
    protected javax.swing.JComboBox<String> jComboBox4;
    protected javax.swing.JComboBox<String> jComboBox5;
    protected com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooserCellEditor jDateChooserCellEditor1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    protected javax.swing.JTextField jTextField1;
    protected javax.swing.JTextField jTextField10;
    protected javax.swing.JTextField jTextField12;
    protected javax.swing.JTextField jTextField13;
    protected javax.swing.JTextField jTextField14;
    protected javax.swing.JTextField jTextField2;
    protected javax.swing.JTextField jTextField3;
    protected javax.swing.JTextField jTextField4;
    protected javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
