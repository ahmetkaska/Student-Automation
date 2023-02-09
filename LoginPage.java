package StudentAutomation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmetkaska
 */
public class LoginPage extends javax.swing.JFrame {

    Student student = new Student("Ahmet", "Kaska", "ahmetkaska", 24, "Sultangazi", "0537 *** ** **", 36, "Computer Engineering");
    Teacher teacher = new Teacher("Ali", "Nizam", "alinizam", 40, "Beyoglu", "0536 *** ** **", "Computer Science", "manager");
    Admin admin = new Admin("Fatih", "Terim", "imparator", 60, "Fulya", "0532 1905 19 05", "Computer Science", "Student Managment");

    /**
     * Creates new form LoginPage
     */
    private static Connection conn = null;
    //String connectionUrl = "jdbc:derby://localhost:1527/StudentAutomation;create=true";

    public LoginPage() {

        initComponents();

    }
//
//    public static Connection java_db(String url) {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            Connection conn = DriverManager.getConnection(url);
//            System.out.println("Baglandi");
//            return conn;
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//            System.out.println("Baglanmadi");
//            return null;
//        }
//
//    }

    public void checkLogin(Person object) {
        Login log = new Login(object.getName(), object.getPassword());;
        if (object.equals(student)) {

            if (log.login(txt_student_userName.getText(), txt_student_password.getText())) {
                System.out.println("Giris yapildi");
            } else {
                JOptionPane.showMessageDialog(null, "Your Username or Password is Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (object.equals(teacher)) {
            if (log.login(txt_teacher_userName.getText(), txt_teacher_password.getText())) {
                System.out.println("Giris yapildi");
            } else {
                JOptionPane.showMessageDialog(null, "Your Username or Password is Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (object.equals(admin)) {
            if (log.login(txt_admin_userName.getText(), txt_admin_password.getText())) {
                AdminPanel admin =new AdminPanel();
                admin.show();
                
            } else {
                JOptionPane.showMessageDialog(null, "Your Username or Password is Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
            }
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

        tabbed_student = new javax.swing.JTabbedPane();
        lbl_student_userName = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_student_password = new javax.swing.JLabel();
        txt_student_userName = new javax.swing.JTextField();
        txt_student_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        check_student_password = new javax.swing.JCheckBox();
        btn_student_login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbl_admin_userName = new javax.swing.JLabel();
        lbl_admin_password = new javax.swing.JLabel();
        txt_admin_userName = new javax.swing.JTextField();
        check_admin_password = new javax.swing.JCheckBox();
        btn_admin_login = new javax.swing.JButton();
        txt_admin_password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btn_teacher_login = new javax.swing.JButton();
        lbl_teacher_userName = new javax.swing.JLabel();
        lbl_teacher_password = new javax.swing.JLabel();
        txt_teacher_userName = new javax.swing.JTextField();
        txt_teacher_password = new javax.swing.JPasswordField();
        check_teacher_password = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page\n");
        setBackground(new java.awt.Color(204, 204, 204));
        setName("Login Page"); // NOI18N

        lbl_student_userName.setBackground(new java.awt.Color(153, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("User Name : ");

        lbl_student_password.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_student_password.setText("Password  :");

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/stdnt.png")); // NOI18N

        check_student_password.setText("Show Password");
        check_student_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_student_passwordActionPerformed(evt);
            }
        });

        btn_student_login.setText("Login");
        btn_student_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_student_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbl_student_userNameLayout = new javax.swing.GroupLayout(lbl_student_userName);
        lbl_student_userName.setLayout(lbl_student_userNameLayout);
        lbl_student_userNameLayout.setHorizontalGroup(
            lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_student_userNameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_student_userNameLayout.createSequentialGroup()
                        .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lbl_student_password))
                        .addGap(30, 30, 30)
                        .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_student_password)
                            .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_student_userName)
                                .addComponent(txt_student_password, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                    .addComponent(btn_student_login, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lbl_student_userNameLayout.setVerticalGroup(
            lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_student_userNameLayout.createSequentialGroup()
                .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_student_userNameLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_student_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(lbl_student_userNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_student_password)
                            .addComponent(txt_student_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(check_student_password)
                        .addGap(28, 28, 28)
                        .addComponent(btn_student_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lbl_student_userNameLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tabbed_student.addTab("Student Login", lbl_student_userName);

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/admin.jpg")); // NOI18N

        lbl_admin_userName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_admin_userName.setText("User Name :");

        lbl_admin_password.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_admin_password.setText("Password  :");

        check_admin_password.setText("Show Password");
        check_admin_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_admin_passwordActionPerformed(evt);
            }
        });

        btn_admin_login.setText("Login");
        btn_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_admin_login, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(check_admin_password)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_admin_userName)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_admin_password)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_admin_userName)
                                    .addComponent(txt_admin_password, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_admin_userName)
                            .addComponent(txt_admin_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_admin_password)
                            .addComponent(txt_admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(check_admin_password)
                        .addGap(18, 18, 18)
                        .addComponent(btn_admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );

        tabbed_student.addTab("Admin Login", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btn_teacher_login.setText("Login");
        btn_teacher_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teacher_loginActionPerformed(evt);
            }
        });

        lbl_teacher_userName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_teacher_userName.setText("User Name : ");

        lbl_teacher_password.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_teacher_password.setText("Password   :");

        check_teacher_password.setText("Show Password");
        check_teacher_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_teacher_passwordActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/newTeacher.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_teacher_userName)
                            .addComponent(lbl_teacher_password))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_teacher_userName)
                            .addComponent(txt_teacher_password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check_teacher_password)
                        .addGap(18, 18, 18)
                        .addComponent(btn_teacher_login, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_teacher_userName)
                    .addComponent(txt_teacher_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_teacher_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_teacher_password))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_teacher_password)
                    .addComponent(btn_teacher_login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        tabbed_student.addTab("Teacher Login", jPanel1);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Hello Everyone !!");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Welcome to My Student Automation");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("I am Ahmet Kaşka :)");

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/newAhmet.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbed_student, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbed_student)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_student_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_student_loginActionPerformed
        // TODO add your handling code here:
        checkLogin(student);
        txt_student_userName.setText("");
        txt_student_password.setText("");
    }//GEN-LAST:event_btn_student_loginActionPerformed

    private void check_student_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_student_passwordActionPerformed
        // TODO add your handling code here:
        if (check_student_password.isSelected()) {
            txt_student_password.setEchoChar((char) 0);
        } else {
            txt_student_password.setEchoChar('*');
        }
    }//GEN-LAST:event_check_student_passwordActionPerformed

    private void btn_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_loginActionPerformed
        // TODO add your handling code here:
        checkLogin(admin);
        txt_admin_userName.setText("");
        txt_admin_password.setText("");
        

    }//GEN-LAST:event_btn_admin_loginActionPerformed

    private void check_admin_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_admin_passwordActionPerformed
        // TODO add your handling code here:
        if (check_admin_password.isSelected()) {
            txt_admin_password.setEchoChar((char) 0);
        } else {
            txt_admin_password.setEchoChar('*');
        }
    }//GEN-LAST:event_check_admin_passwordActionPerformed

    DbHelper db = new DbHelper();
    PreparedStatement statement = null;
    private void btn_teacher_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teacher_loginActionPerformed
        // TODO add your handling code here:
        checkLogin(teacher);
        if (teacher.getStatus() == "manager") {
            /*
            String sql = "INSERT INTO ROOT.ADMIN (NAME, SURNAME, PASSWORD, AGE, ADDRESS, TELEPHONENUMBER, DEPARTMENT, STATUS) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement inst = null;
            try {
                conn = DriverManager.getConnection(connectionUrl, "root", "admin");
                inst = conn.prepareStatement(sql);
                inst.setString(1, teacher.getName());
                inst.setString(2, teacher.getSurname());
                inst.setString(3, teacher.getPassword());
                inst.setInt(4, teacher.getAge());
                inst.setString(5, teacher.getAddress());
                inst.setString(6, teacher.getTelephoneNumber());
                inst.setString(7, teacher.getDepartment());
                inst.setString(8, teacher.getStatus());
                inst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Added");

            } catch (SQLException e) {
                Logger.getLogger(admin.getName()).log(Level.SEVERE, null, e);

            } finally {
                if (inst != null) {
                    try {
                        inst.close();
                    } catch (SQLException e) {
                        Logger.getLogger(admin.getName()).log(Level.SEVERE, null, e);

                    }
                }
            }
            
            System.out.println("-------------------");
            try{
                String dbURL1 = "jdbc:derby://localhost:1527/StudentAutomation;create=true";
            Connection conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected to database #1");
            }
            }
            catch(SQLException e){
                 e.printStackTrace();
            }
            
             
        }

        try {
            conn = db.getConnection();
            //(NAME, SURNAME, PASSWORD, AGE, ADDRESS, TELEPHONENUMBER, DEPARTMENT, STATUS)
            String sql = "INSERT INTO StudentAutomation.admin  "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, teacher.getName());
            statement.setString(2, teacher.getSurname());
            statement.setString(3, teacher.getPassword());
            statement.setInt(4, teacher.getAge());
            statement.setString(5, teacher.getAddress());
            statement.setString(6, teacher.getTelephoneNumber());
            statement.setString(7, teacher.getDepartment());
            statement.setString(8, teacher.getStatus());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (SQLException ex) {
            db.ShowError(ex);
        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
       */
        txt_teacher_userName.setText("");
        txt_teacher_password.setText("");
        }
    }//GEN-LAST:event_btn_teacher_loginActionPerformed

    private void check_teacher_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_teacher_passwordActionPerformed
        // TODO add your handling code here:
        if (check_teacher_password.isSelected()) {
            txt_teacher_password.setEchoChar((char) 0);
        } else {
            txt_teacher_password.setEchoChar('*');
        }
    }//GEN-LAST:event_check_teacher_passwordActionPerformed

    /**
     * @param args the command line arguments
     *
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin_login;
    private javax.swing.JButton btn_student_login;
    private javax.swing.JButton btn_teacher_login;
    private javax.swing.JCheckBox check_admin_password;
    private javax.swing.JCheckBox check_student_password;
    private javax.swing.JCheckBox check_teacher_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_admin_password;
    private javax.swing.JLabel lbl_admin_userName;
    private javax.swing.JLabel lbl_student_password;
    private javax.swing.JPanel lbl_student_userName;
    private javax.swing.JLabel lbl_teacher_password;
    private javax.swing.JLabel lbl_teacher_userName;
    private javax.swing.JTabbedPane tabbed_student;
    private javax.swing.JPasswordField txt_admin_password;
    private javax.swing.JTextField txt_admin_userName;
    private javax.swing.JPasswordField txt_student_password;
    private javax.swing.JTextField txt_student_userName;
    private javax.swing.JPasswordField txt_teacher_password;
    private javax.swing.JTextField txt_teacher_userName;
    // End of variables declaration//GEN-END:variables
}
