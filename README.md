# Student Automation

I made a student automation system project in Java language. I designed the interfaces with Swing in the project, where there are object-oriented programming-based operations such as encapsulation, override, inheritance, and I used the mySql Workbench database in the project. I have given the admin authority to create student and teacher objects that inherit properties from the course class and the Person class. The administrator creates objects and the information of the created objects is stored in the database. The information received from the database and the values entered by the users in the text fields on the login page are checked. The teacher can grade the students. Students can access grade information from their syllabus.

For detailed information, you can browse the report from the <h3>StudentAutomation.pdf</h3> file.

<hr>

       				Student Automation

I implemented a student automation project in Java. I defined classes such as person, student, teacher, admin, course. I reduced code duplication by establishing an inheritance relationship between these classes. I grasped the basics of object-oriented programming in this project. I used encapsulation, inheritance, overriding methods. I learned to design interfaces with Swing. I used database MySql Workbench. The information of the created objects is stored in the database.

•	Student Panels.

 <img width="376" alt="image" src="https://user-images.githubusercontent.com/79384854/221017111-bb274636-ef9d-470a-857a-52e62fc61b2d.png">

•	If password or user name is wrong.

<img width="376" alt="image" src="https://user-images.githubusercontent.com/79384854/221017204-77ea4191-2607-4535-ace9-69e8edb6dfa1.png">

•	Show password in student login page.

<img width="387" alt="image" src="https://user-images.githubusercontent.com/79384854/221017283-cc068297-9420-452a-854c-410ad6661469.png">

•	We can access the student's personal information, course schedule and grade information through the Student Panel.

<img width="365" alt="image" src="https://user-images.githubusercontent.com/79384854/221017489-50c0e41c-7bf0-4021-9c00-a76c2a9378f1.png">

•	Syllabus
 
 <img width="365" alt="image" src="https://user-images.githubusercontent.com/79384854/221017569-96092e31-df7c-4671-a099-038bf10cf69e.png">

•	Note Informations

 <img width="387" alt="image" src="https://user-images.githubusercontent.com/79384854/221017669-c204f166-6457-4690-9168-5ad678dc97f4.png">

•	Admin Panels
        
<img width="394" alt="image" src="https://user-images.githubusercontent.com/79384854/221017724-574e569b-fbf2-4ae4-b30b-a1a5359c3e30.png">
        
•	If password or username of admin is wrong

<img width="388" alt="image" src="https://user-images.githubusercontent.com/79384854/221017842-68972606-12be-4ab1-b110-48a85398411f.png">
  
•	Show admin’s password

<img width="435" alt="image" src="https://user-images.githubusercontent.com/79384854/221017960-51ee30d9-94f9-471e-9343-9e581cac6f7d.png">

•	There is admin information in the Admin Panel. There are student, teacher and course creation processes. (Classes belonging to student and teacher objects have inherited some properties from the Person class.) The information of the objects created through these processes is stored in the database.

<img width="409" alt="image" src="https://user-images.githubusercontent.com/79384854/221018033-63bc1683-824f-415f-9f64-cf2f1c15c2e4.png">
      
•	Creat Teacher

 <img width="416" alt="image" src="https://user-images.githubusercontent.com/79384854/221018113-83acb5cf-293e-48b0-ab20-053f7828244e.png">
      
•	If there are text fields left blank, it gives a warning message.

<img width="365" alt="image" src="https://user-images.githubusercontent.com/79384854/221017366-63321d5a-7520-4f4b-bf90-e7ae928181de.png">
     
•	A new teacher object is created by filling in the text fields, and the information that a new record has been added to the database of the created teacher object's information is displayed.

<img width="417" alt="image" src="https://user-images.githubusercontent.com/79384854/221018197-cbb3b44d-60c0-4999-a2b6-b2593f8722f5.png">
        
•	With the Show teacher button, the teacher records drawn from the database are displayed.

 <img width="420" alt="image" src="https://user-images.githubusercontent.com/79384854/221018253-9caf0d2b-57eb-41ff-9cb9-48ecbcb7eb0f.png">
 
•	Creat Student

 <img width="429" alt="image" src="https://user-images.githubusercontent.com/79384854/221018317-74990fd7-c4ba-4d7e-a2a5-17c5532e9cc9.png">
     
•	If there are text fields left blank, it gives a warning message.

<img width="432" alt="image" src="https://user-images.githubusercontent.com/79384854/221018402-205f9d7e-7a0a-4ada-bcb8-1216dfcfc8b7.png">
      
•	A new student object is created by filling in the text fields, and the information that a new record has been added to the database of the created student object's information is displayed.

<img width="423" alt="image" src="https://user-images.githubusercontent.com/79384854/221018486-76665ffe-9b47-4bef-98e3-4b1f976ddcd5.png">
           
•	With the Show student button, the teacher records drawn from the database are displayed.

<img width="423" alt="image" src="https://user-images.githubusercontent.com/79384854/221018583-1f93d0bd-8c3a-47e7-9a31-7581dc7e14a9.png">
          
•	Creat Course

<img width="439" alt="image" src="https://user-images.githubusercontent.com/79384854/221018643-94766f9b-447e-45ce-9de6-381a8ba009f3.png">
                 
•	If there are text fields left blank, it gives a warning message.

 <img width="442" alt="image" src="https://user-images.githubusercontent.com/79384854/221018714-2915a5b0-a893-42f0-8d89-ed2cd298dedb.png">
 
•	A new course object is created by filling in the text fields, and the information that a new record has been added to the database of the created course object's information is displayed.

<img width="428" alt="image" src="https://user-images.githubusercontent.com/79384854/221018811-a8f90698-39d0-429c-8358-7ba6f2673b63.png">
      
•	With the Show course button, the teacher records drawn from the database are displayed.

 <img width="431" alt="image" src="https://user-images.githubusercontent.com/79384854/221018888-9585a0e6-4789-4b88-bd55-c20b529e75a5.png">
    
•	Teacher Panels

<img width="426" alt="image" src="https://user-images.githubusercontent.com/79384854/221018937-e9a6147d-6108-4bf0-838c-bb609a7acc18.png">
          
•	If password or username of teacher is wrong

<img width="426" alt="image" src="https://user-images.githubusercontent.com/79384854/221019058-60bdcc6a-4064-4454-a71f-e7832bf0c55f.png">
         
•	The teacher whose entry is successful in the teacher panel enters the midterm and final grades of the students according to the courses they have taken. The average is calculated together with the percentage effects of these grades and the letter grade is determined by the letter grade calculation function.

<img width="428" alt="image" src="https://user-images.githubusercontent.com/79384854/221019168-5323ecc9-0ec5-4045-890a-3f53961d48d3.png">
        
•	If there are text fields left blank, it gives a warning message.

 <img width="426" alt="image" src="https://user-images.githubusercontent.com/79384854/221019257-a8f0d351-484e-4dd9-9ac1-729b22908967.png">
       
•	Database Testing

<img width="454" alt="image" src="https://user-images.githubusercontent.com/79384854/221019366-0b2837de-27ba-4832-b7f1-a145f3c5c63f.png">

 
