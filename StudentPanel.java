package StudentAutomations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmetkaska
 */
public class StudentPanel extends javax.swing.JFrame {
    // attibute
    Student student;

    // Constructors
    public StudentPanel() {
        initComponents();
    }
    // This constructor
    public StudentPanel(Student student) {
        initComponents();
        // With this constructor method, data is passed and the address of the received object in ram is pointed in our own attribute. Thus, we have accessed information through our own attributes.
        this.student = student; 
        //We called this function in the constructor method. Because to show information as soon as the interface is created.
        loginInfoStudent(); 
    }
    
    public void loginInfoStudent() {
        String age = Integer.toString(this.student.getAge());
        String number = Integer.toString(this.student.getStudentNumber());
        lbl_studentInfo.setText("Information of " + this.student.getName().toUpperCase() + " " + this.student.getSurname().toUpperCase());
        lbl_age.setText(age);
        lbl_address.setText(this.student.getAddress());
        lbl_telephone.setText(this.student.getTelephoneNumber());
        lbl_number.setText(number);
        lbl_department.setText(this.student.getDepartment());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_syllabus = new javax.swing.JButton();
        btn_grade = new javax.swing.JButton();
        btn_studentInfo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lbl_studentInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_age = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_telephone = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_department = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_grade = new javax.swing.JTable();
        txt_gradeInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("- Student Panel -");

        jPanel1.setBackground(new java.awt.Color(0, 119, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/newAta.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 670, 210));

        jPanel2.setBackground(new java.awt.Color(173, 232, 244));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/ahmetkaska/Desktop/resimler/ogrenciler.jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Welcome to Dear Student");

        btn_syllabus.setBackground(new java.awt.Color(0, 119, 182));
        btn_syllabus.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_syllabus.setForeground(new java.awt.Color(255, 255, 255));
        btn_syllabus.setText("Syllabus");
        btn_syllabus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_syllabusActionPerformed(evt);
            }
        });

        btn_grade.setBackground(new java.awt.Color(0, 119, 182));
        btn_grade.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_grade.setForeground(new java.awt.Color(255, 255, 255));
        btn_grade.setText("Note Information");
        btn_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gradeActionPerformed(evt);
            }
        });

        btn_studentInfo.setBackground(new java.awt.Color(0, 119, 182));
        btn_studentInfo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_studentInfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_studentInfo.setText("Student Information");
        btn_studentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_studentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_syllabus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(btn_studentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_syllabus, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 790));
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 119, 182));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_studentInfo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_studentInfo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbl_studentInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_studentInfo.setText("jLabel4");
        jPanel3.add(lbl_studentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 19, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age              :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 92, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address       : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 169, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telephone   :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number       :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 329, -1, -1));

        lbl_age.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbl_age.setForeground(new java.awt.Color(255, 255, 255));
        lbl_age.setText("jLabel8");
        jPanel3.add(lbl_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 92, -1, -1));

        lbl_address.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 255, 255));
        lbl_address.setText("jLabel9");
        jPanel3.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 169, -1, -1));

        lbl_telephone.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbl_telephone.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telephone.setText("jLabel10");
        jPanel3.add(lbl_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 250, -1, -1));

        lbl_number.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbl_number.setForeground(new java.awt.Color(255, 255, 255));
        lbl_number.setText("jLabel11");
        jPanel3.add(lbl_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 329, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Department :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 401, -1, -1));

        lbl_department.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbl_department.setForeground(new java.awt.Color(255, 255, 255));
        lbl_department.setText("jLabel13");
        jPanel3.add(lbl_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 401, -1, -1));

        jTabbedPane2.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(217, 217, 217));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        jTable2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Computer Programming 1", null, "        +", null, null, null},
                {"Introduction Computer Engineering", "        +", null, null, null, null},
                {"Java Programming", null, null, "        +", null, null},
                {"Python Programming", null, null, null, "        +", null},
                {"C Programming", "        +", null, null, null, null},
                {"Database Management", null, "        +", null, null, null},
                {"Computer Network", null, null, null, null, "     +"}
            },
            new String [] {
                "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ));
        jTable2.setAlignmentX(10.0F);
        jTable2.setAlignmentY(10.0F);
        jTable2.setEditingColumn(10);
        jTable2.setEditingRow(10);
        jTable2.setGridColor(new java.awt.Color(0, 153, 204));
        jTable2.setSelectionForeground(new java.awt.Color(255, 204, 204));
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 520));

        jTabbedPane2.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 239, 219));

        table_grade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_grade);

        txt_gradeInfo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txt_gradeInfo.setText("jLabel8");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txt_gradeInfo)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txt_gradeInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jTabbedPane2.addTab("tab3", jPanel5);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 670, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_studentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentInfoActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0); // index page 0
        loginInfoStudent();
    }//GEN-LAST:event_btn_studentInfoActionPerformed

    private void btn_syllabusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_syllabusActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1); // index page 0
        jTable2.setRowHeight(69); // table row height

    }//GEN-LAST:event_btn_syllabusActionPerformed

    private void btn_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gradeActionPerformed
        // I have shown the grade information of the student who has successfully entered in the table.
        jTabbedPane2.setSelectedIndex(2); // index page 0
        txt_gradeInfo.setText("Grade Informations of " + this.student.getName().toUpperCase() + " " +this.student.getSurname().toUpperCase());
        
        table_grade.setModel(new DefaultTableModel(null, new String[]{"Course Tittle", "Midterm", "Final", "Letter Grade"}));
        Connection conn = null;
        DbHelper db = new DbHelper();
        
        DefaultTableModel tblModel = (DefaultTableModel) table_grade.getModel();
        String sql2 = "Select  c.course_tittle, g.midterm, g.final, g.letter From SchoolAutomation.students s\n"
                + "Join SchoolAutomation.grades g On s.student_number = g.student_number\n"
                + "Join SchoolAutomation.courses c On g.course_tittle = c.course_tittle\n"
                + "Where s.student_number = " + this.student.getStudentNumber();
        
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();
            
            String id;
            while (rs.next()) {
                
                tblModel.addRow(new String[]{rs.getString("course_tittle"), rs.getString("midterm"), rs.getString("final"), rs.getString("letter")});
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
        table_grade.setRowHeight(50);
        
    }//GEN-LAST:event_btn_gradeActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_grade;
    private javax.swing.JButton btn_studentInfo;
    private javax.swing.JButton btn_syllabus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_department;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_studentInfo;
    private javax.swing.JLabel lbl_telephone;
    private javax.swing.JTable table_grade;
    private javax.swing.JLabel txt_gradeInfo;
    // End of variables declaration//GEN-END:variables
}
