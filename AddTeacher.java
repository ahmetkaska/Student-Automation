package StudentAutomations;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmetkaska
 */
public class AddTeacher extends javax.swing.JFrame {

    ArrayList<Teacher> allTeacher = new ArrayList<>();
    Teacher teacher;

    /**
     * Creates new form AddTeacher
     */
    public AddTeacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_addTeacher_userName = new javax.swing.JLabel();
        txt_addTeacher_userName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_addTeacher_surname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_addTeacher_password = new javax.swing.JTextField();
        spinner_teacher_age = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_teacher_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_teacher_telephone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_teacher_department = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_teacher_status = new javax.swing.JTextField();
        btn_teacher_create = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_addTeacher = new javax.swing.JTable();
        btn_addTeacher_showTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Teacher Panel");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lbl_addTeacher_userName.setText("Name       :");

        jLabel1.setText("Surname :");

        txt_addTeacher_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addTeacher_surnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password : ");

        jLabel3.setText("Age         :");

        jLabel4.setText("Address   :");

        jLabel5.setText("Telephone :");

        jLabel6.setText("Department :");

        jLabel7.setText("Status     : ");

        btn_teacher_create.setText("Create Teacher");
        btn_teacher_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teacher_createActionPerformed(evt);
            }
        });

        table_addTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Password", "Age", "Address", "Telephone", "Department", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_addTeacher);

        btn_addTeacher_showTable.setText("Show Teachers");
        btn_addTeacher_showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTeacher_showTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(lbl_addTeacher_userName)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_addTeacher_userName)
                            .addComponent(txt_addTeacher_password, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txt_teacher_address)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_teacher_department, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_addTeacher_surname)
                            .addComponent(spinner_teacher_age, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_teacher_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_teacher_status, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_teacher_create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addTeacher_showTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_addTeacher_userName)
                    .addComponent(txt_addTeacher_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_addTeacher_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_addTeacher_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_teacher_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_teacher_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_teacher_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_teacher_create))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_teacher_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_teacher_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addTeacher_showTable))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_addTeacher_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addTeacher_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addTeacher_surnameActionPerformed

    private void btn_teacher_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teacher_createActionPerformed
        // If the text fields are empty, a warning message is given.

        int spinner = Integer.parseInt(spinner_teacher_age.getValue().toString());
        if (txt_addTeacher_userName.getText().equals("") || txt_addTeacher_surname.getText().equals("") || txt_addTeacher_password.getText().equals("") || txt_teacher_address.getText().equals("") || txt_teacher_telephone.getText().equals("") || txt_teacher_department.getText().equals("") || txt_teacher_status.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Please Fill in the All Gaps!!", "Warning",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            // Create teacher object
            teacher = new Teacher(txt_addTeacher_userName.getText(), txt_addTeacher_surname.getText(), txt_addTeacher_password.getText(), spinner, txt_teacher_address.getText(), txt_teacher_telephone.getText(), txt_teacher_department.getText(), txt_teacher_status.getText());
            // Database operations
            Connection conn = null;
            DbHelper db = new DbHelper();
            PreparedStatement statement = null;

            try {
                conn = db.getConnection(); // Connect database with getConnection() functions in DbHelper class.
                // We save all the fields of the created teacher object to the database.

                String sql = "Insert Into SchoolAutomation.teachers (id_teachers, name, surname, password, age, address, telephone, department, status) Values(?,?,?,?,?,?,?,?,?);";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, teacher.getTeacherId());
                statement.setString(2, teacher.getName());
                statement.setString(3, teacher.getSurname());
                statement.setString(4, teacher.getPassword());
                statement.setInt(5, teacher.getAge());
                statement.setString(6, teacher.getAddress());
                statement.setString(7, teacher.getTelephoneNumber());
                statement.setString(8, teacher.getDepartment());
                statement.setString(9, teacher.getStatus());
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
        txt_addTeacher_userName.setText("");
        txt_addTeacher_surname.setText("");
        txt_addTeacher_password.setText("");
        txt_teacher_address.setText("");
        txt_teacher_telephone.setText("");
        txt_teacher_department.setText("");
        txt_teacher_status.setText("");
    }//GEN-LAST:event_btn_teacher_createActionPerformed

    private void btn_addTeacher_showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTeacher_showTableActionPerformed
        // Rearrange table field names.

        table_addTeacher.setModel(new DefaultTableModel(null, new String[]{"Id", "Name", "Surname", "Password", "Age", "Address", "Telephone Number", "Department", "Status"}));
        Connection conn = null;
        DbHelper db = new DbHelper();

        DefaultTableModel tblModel = (DefaultTableModel) table_addTeacher.getModel();
        String sql2 = "Select * From SchoolAutomation.teachers";// Sql query, select all columns teachers table
        // We take the records on a line basis and give all fields as elements to the created String type array. So we show it in the table.

        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();

            String id;
            while (rs.next()) {
                id = Integer.toString(rs.getInt("id_teachers"));
                // Add array row-based
                tblModel.addRow(new String[]{id, rs.getString("name"), rs.getString("surname"), rs.getString("password"), rs.getString("age"), rs.getString("address"), rs.getString("telephone"), rs.getString("department"), rs.getString("status")});
            }

        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
        } finally {
            try {

                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(AddTeacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_addTeacher_showTableActionPerformed

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
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addTeacher_showTable;
    private javax.swing.JButton btn_teacher_create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_addTeacher_userName;
    private javax.swing.JSpinner spinner_teacher_age;
    private javax.swing.JTable table_addTeacher;
    private javax.swing.JTextField txt_addTeacher_password;
    private javax.swing.JTextField txt_addTeacher_surname;
    private javax.swing.JTextField txt_addTeacher_userName;
    private javax.swing.JTextField txt_teacher_address;
    private javax.swing.JTextField txt_teacher_department;
    private javax.swing.JTextField txt_teacher_status;
    private javax.swing.JTextField txt_teacher_telephone;
    // End of variables declaration//GEN-END:variables
}
