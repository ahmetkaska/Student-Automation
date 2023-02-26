<h3> Student Automation Summary </h3>

I made a student automation system project in Java language. I designed the interfaces with Swing in the project, where there are object-oriented programming-based operations such as encapsulation, override, inheritance, and I used the mySql Workbench database in the project. I have given the admin authority to create student and teacher objects that inherit properties from the course class and the Person class. The administrator creates objects and the information of the created objects is stored in the database. The information received from the database and the values entered by the users in the text fields on the login page are checked. The teacher can grade the students. Students can access grade information from their syllabus.

See below for detailed information;
<hr>

<h1 style="color:blue;text-align:center;">Student Automation</h1>

I implemented a student automation project in Java. I defined classes such as person, student, teacher, admin, course. I reduced code duplication by establishing an inheritance relationship between these classes. I grasped the basics of object-oriented programming in this project. I used encapsulation, inheritance, overriding methods. I learned to design interfaces with Swing. I used database MySql Workbench. The information of the created objects is stored in the database.

•	Student Panels.

<img width="376" alt="image" src="https://user-images.githubusercontent.com/79384854/221425337-77eb1f6a-cc7c-4cd8-85e8-40b86ec7b38b.png">

•	If password or user name is wrong.

<img width="376" alt="image" src="https://user-images.githubusercontent.com/79384854/221425357-384b8c91-6ab1-4ff8-81f1-11e9102e6d81.png">

•	Show password in student login page.

<img width="388" alt="image" src="https://user-images.githubusercontent.com/79384854/221425391-c84fcc89-23b8-488d-ab03-f76e7afb1bdf.png">
   
•	We can access the student's personal information, course schedule and grade information through the Student Panel.

 <img width="365" alt="image" src="https://user-images.githubusercontent.com/79384854/221425421-2c283e7b-3b85-48a8-9960-cd706fa8ebb5.png">

•	Syllabus

<img width="365" alt="image" src="https://user-images.githubusercontent.com/79384854/221425441-a030387b-961f-49fd-ae53-4bcaa2d46404.png">
                                                                                
•	Note Informations

 <img width="365" alt="image" src="https://user-images.githubusercontent.com/79384854/221425447-548b8ba8-c933-44b8-8b36-c78853e05dcc.png">

•	Admin Panels

<img width="387" alt="image" src="https://user-images.githubusercontent.com/79384854/221425470-5d8ea958-fa3c-4662-8d3a-129ebb3e45fa.png">
    
•	If password or username of admin is wrong

<img width="394" alt="image" src="https://user-images.githubusercontent.com/79384854/221425499-f37e05ba-4751-4aa1-8689-901b74801119.png">

•	Show admin’s password

<img width="388" alt="image" src="https://user-images.githubusercontent.com/79384854/221425526-241b091d-1638-4764-9c3f-581c2ad7b667.png">
           
•	There is admin information in the Admin Panel. There are student, teacher and course creation processes. (Classes belonging to student and teacher objects have inherited some properties from the Person class.) The information of the objects created through these processes is stored in the database.

<img width="435" alt="image" src="https://user-images.githubusercontent.com/79384854/221425545-0ab579cc-4475-448d-9c45-0683e4320ca3.png">
       
•	Creat Teacher

<img width="409" alt="image" src="https://user-images.githubusercontent.com/79384854/221425569-2544663b-ceb4-456c-a89b-219716895a16.png">
       
•	If there are text fields left blank, it gives a warning message.

<img width="416" alt="image" src="https://user-images.githubusercontent.com/79384854/221425590-50a42fa8-5b27-4391-b15d-243697259c01.png">
     
•	A new teacher object is created by filling in the text fields, and the information that a new record has been added to the database of the created teacher object's information is displayed.

<img width="417" alt="image" src="https://user-images.githubusercontent.com/79384854/221425620-b9f2dc96-faee-445f-9475-8d8b19895df0.png">
        
•	With the Show teacher button, the teacher records drawn from the database are displayed.

<img width="420" alt="image" src="https://user-images.githubusercontent.com/79384854/221425630-4e203365-589b-4869-bed8-06c4912bf889.png">
           
•	Creat Student

<img width="429" alt="image" src="https://user-images.githubusercontent.com/79384854/221425640-985748da-b3a7-450c-9034-c6aad85030db.png">
        
•	If there are text fields left blank, it gives a warning message.

<img width="432" alt="image" src="https://user-images.githubusercontent.com/79384854/221425656-c1ad0d98-c63d-44de-a2a0-a4af47bd6846.png">
      
•	A new student object is created by filling in the text fields, and the information that a new record has been added to the database of the created student object's information is displayed.

<img width="423" alt="image" src="https://user-images.githubusercontent.com/79384854/221425674-393f254f-993d-4a43-9dd0-fcc0e6f2f773.png">
           
•	With the Show student button, the teacher records drawn from the database are displayed.
          
<img width="423" alt="image" src="https://user-images.githubusercontent.com/79384854/221425694-e2d53176-1bf4-4cf0-a3ad-92554ae8fe5b.png">

•	Creat Course

<img width="439" alt="image" src="https://user-images.githubusercontent.com/79384854/221425704-b54968aa-ac7c-4616-b7f4-3c019321d0a5.png">
                 
•	If there are text fields left blank, it gives a warning message.

<img width="442" alt="image" src="https://user-images.githubusercontent.com/79384854/221425717-6e4cf22b-da4d-42d2-944f-ba189b20e69c.png">
 
•	A new course object is created by filling in the text fields, and the information that a new record has been added to the database of the created course object's information is displayed.

<img width="428" alt="image" src="https://user-images.githubusercontent.com/79384854/221425742-ddde9027-1f54-43c1-8e9a-900bc7b9472a.png">
      
•	With the Show course button, the teacher records drawn from the database are displayed.

<img width="431" alt="image" src="https://user-images.githubusercontent.com/79384854/221425770-63ae4b83-93ab-4c14-8acb-7e6138079cc1.png">
      
•	Teacher Panels

<img width="426" alt="image" src="https://user-images.githubusercontent.com/79384854/221425779-b6a99225-5315-42ad-9276-db55679783f4.png">
  
•	If password or username of teacher is wrong

<img width="426" alt="image" src="https://user-images.githubusercontent.com/79384854/221425802-3f84b3ee-8da4-4ead-9c1d-77430ce2a5fc.png">
         
•	The teacher whose entry is successful in the teacher panel enters the midterm and final grades of the students according to the courses they have taken. The average is calculated together with the percentage effects of these grades and the letter grade is determined by the letter grade calculation function.

<img width="428" alt="image" src="https://user-images.githubusercontent.com/79384854/221425827-67560581-34d7-4576-9086-a5efc018d490.png">
        
•	If there are text fields left blank, it gives a warning message.

<img width="426" alt="image" src="https://user-images.githubusercontent.com/79384854/221425845-15b67c8d-0b04-41aa-a648-b516820d6ca2.png">
       
•	Database Testing

<img width="454" alt="image" src="https://user-images.githubusercontent.com/79384854/221425885-033338d3-a7f3-43c7-9884-0886002f09e5.png">


 
			
