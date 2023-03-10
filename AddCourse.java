
package StudentAutomations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmetkaska
 */
public class AddCourse extends javax.swing.JFrame {

    Course course;

   
    public AddCourse() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_addCourse_courseTittle = new javax.swing.JTextField();
        txt_addCourse_passGrades = new javax.swing.JTextField();
        txt_addCourse_courseCredits = new javax.swing.JTextField();
        btn_createCourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_createCourse = new javax.swing.JTable();
        btn_addCourse_showCourses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("- Create Course Panel -");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Course Tittle :");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Pass Grade :");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Course Credits :");

        btn_createCourse.setText("Create Course");
        btn_createCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createCourseActionPerformed(evt);
            }
        });

        table_createCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Tittle", "Pass Grade", "Course Credits"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_createCourse);

        btn_addCourse_showCourses.setText("Show Courses");
        btn_addCourse_showCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCourse_showCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_addCourse_courseTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_addCourse_passGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_addCourse_courseCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_createCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_addCourse_showCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_addCourse_courseTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_addCourse_passGrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createCourse))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_addCourse_courseCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addCourse_showCourses))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createCourseActionPerformed
        
        // If the text fields are empty, a warning message is given.
        if (txt_addCourse_courseTittle.getText().equals("") || txt_addCourse_passGrades.getText().equals("") || txt_addCourse_courseCredits.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill in the All Gaps!!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            double passGrade = Double.parseDouble(txt_addCourse_passGrades.getText()); // Convert string to double
            int credits = Integer.parseInt(txt_addCourse_courseCredits.getText());    // Convert string to integer
            // Create course object
            course = new Course(txt_addCourse_courseTittle.getText(), passGrade, credits);
            
            // Database operations
            Connection conn = null;
            DbHelper db = new DbHelper();
            PreparedStatement statement = null;
           
            // We save all the fields of the created course object to the database.
            try {
                conn = db.getConnection();  // Connection database
                String sql = "Insert Into SchoolAutomation.courses (id_courses, course_tittle, pass_grade, course_credits) Values(?,?,?,?);"; // Sql query, insert record in database
                statement = conn.prepareStatement(sql);
                statement.setInt(1, course.getCourseId());
                statement.setString(2, course.getCourseTittle());
                statement.setDouble(3, course.getPassGrade());
                statement.setInt(4, course.getCredits());
                
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registration successfully added ????");

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
        // Emptying text fields
        txt_addCourse_courseTittle.setText("");
        txt_addCourse_passGrades.setText("");
        txt_addCourse_courseCredits.setText("");
        
    }//GEN-LAST:event_btn_createCourseActionPerformed

    private void btn_addCourse_showCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCourse_showCoursesActionPerformed
        
        Connection conn = null;
        DbHelper db = new DbHelper();
        
        DefaultTableModel tblModel = (DefaultTableModel) table_createCourse.getModel();  
        String sql2 = "Select * From SchoolAutomation.courses";     // Sql query, select all column in courses table
        
        // We take the records on a line basis and give all fields as elements to the created String type array. So we show it in the table.
        try {
            conn = db.getConnection(); // Connection
            PreparedStatement pst = conn.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();

            String id, passGrade, credits;
            while (rs.next()) {
                id = Integer.toString(rs.getInt("id_courses"));
                passGrade = Integer.toString(rs.getInt("pass_grade"));
                credits = Integer.toString(rs.getInt("course_credits"));
                tblModel.addRow(new String[]{id, rs.getString("course_tittle"), passGrade, credits });
            }

        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
        }
       finally{
            try {
                
                conn.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(AddTeacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btn_addCourse_showCoursesActionPerformed

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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCourse_showCourses;
    private javax.swing.JButton btn_createCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_createCourse;
    private javax.swing.JTextField txt_addCourse_courseCredits;
    private javax.swing.JTextField txt_addCourse_courseTittle;
    private javax.swing.JTextField txt_addCourse_passGrades;
    // End of variables declaration//GEN-END:variables
}
