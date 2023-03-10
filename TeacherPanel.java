package StudentAutomations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmetkaska
 */
public class TeacherPanel extends javax.swing.JFrame {

    // Comboboxes
    DefaultComboBoxModel course = new DefaultComboBoxModel();
    DefaultComboBoxModel student = new DefaultComboBoxModel();

    /**
     * Creates new form TeacherPanel
     */
    public TeacherPanel() {
        initComponents();
        // The reason it is inside the constructor method is to get the information when the interface is created.
        courses();
        students();
    }

    public void courses() {
        try {
            //Connect to Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SchoolAutomation", "root", "12345678");

            Statement query = connect.createStatement();
            ResultSet rs = query.executeQuery("Select * From SchoolAutomation.courses");
            // Take elemnent of course_tittle column of courses table
            while (rs.next()) {
                course.addElement(rs.getString("course_tittle")); // add combobox

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        comboBox_courses.setModel(course);
    }

    public void students() {
        try {
            //Connect to Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SchoolAutomation", "root", "12345678");

            Statement query = connect.createStatement();
            ResultSet rs = query.executeQuery("Select * From SchoolAutomation.students");
            // Take elemnent of cstudent_number column of students table
            while (rs.next()) {
                student.addElement(rs.getString("student_number"));

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        comboBox_students.setModel(student);
    }

    // The letter grade is determined according to the average of the final and midterm grades according to the percentage effects.
    public String letterGrade(int midterm, int finalGrade) {
        // If grades are less than 0 , warning message
        if (midterm < 0 || finalGrade < 0) {
            JOptionPane.showMessageDialog(null, "Dear Teacher You Should Check Inputs !");
        }

        int mean = (int) ((midterm * 0.3) + (finalGrade * 0.7)); // Average of final and midterm grades according to percentage effects

        if (mean >= 0 && mean < 50) {
            return "FF";
        } else if (mean >= 50 && mean < 60) {
            return "DD";
        } else if (mean >= 60 && mean < 65) {
            return "CC";
        } else if (mean >= 65 && mean < 70) {
            return "CB";
        } else if (mean >= 70 && mean < 75) {
            return "BB";
        } else if (mean >= 75 && mean < 85) {
            return "BA";
        } else {
            return "AA";
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBox_courses = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboBox_students = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_midterm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_final = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("- Teacher Panel -");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/mahmuthocanew.jpeg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/newAta.jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Welcome to Dear Teacher");

        comboBox_courses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Courses");

        comboBox_students.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student" }));
        comboBox_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_studentsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Students");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Midterm Grade");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Final Grade");

        jButton1.setBackground(new java.awt.Color(255, 228, 196));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Give Grade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(comboBox_courses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(comboBox_students, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(66, 66, 66)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_midterm, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_students, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_midterm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_studentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_studentsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // If texfields is empty, warning message

        if (txt_midterm.getText().equals("") || txt_final.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Dear Teacher Please Fill in the Gaps !");
        } else {
            // Connection database
            Connection conn = null;
            DbHelper db = new DbHelper();
            PreparedStatement statement = null;

            try {
                conn = db.getConnection(); // connect
                // Convert String to integer
                int midterm = Integer.parseInt(txt_midterm.getText());
                int finalGrade = Integer.parseInt(txt_final.getText());
                int student_number = Integer.parseInt(comboBox_students.getSelectedItem().toString());
                // Sql query, add record grades table
                String sql = "Insert Into SchoolAutomation.grades (student_number, course_tittle, midterm, final, letter) Values(?,?,?,?,?);";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, student_number);
                statement.setString(2, comboBox_courses.getSelectedItem().toString());
                statement.setInt(3, midterm);
                statement.setInt(4, finalGrade);
                statement.setString(5, letterGrade(midterm, finalGrade));

                statement.executeUpdate();

            } catch (SQLException ex) {
                db.ShowError(ex);
            } finally {
                try {
                    statement.close();

                } catch (SQLException ex) {
                    Logger.getLogger(AddTeacher.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddTeacher.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }


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
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox_courses;
    private javax.swing.JComboBox<String> comboBox_students;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_final;
    private javax.swing.JTextField txt_midterm;
    // End of variables declaration//GEN-END:variables
}
