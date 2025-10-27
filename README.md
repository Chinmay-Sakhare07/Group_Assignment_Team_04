# Group_Assignment_Team_04
Chinmay Sakhare, Pranjal Patil, Anisha Gaikar - Group Assignment 1: Implementing Access-Controlled Use Cases in a Digital University System



The Smart Digital University System is a Java-based platform built to simplify how universities manage people, courses, and academic data — all while keeping information secure through role-based access. Our project brings together four key users: Administrators, Faculty, Students, and Registrars, each with their own dashboard and permissions. The Administrator can register new users, assign roles, and view university-wide analytics. Faculty members can update course details, track student progress, and record grades. Students get a seamless way to enroll in courses, pay tuition, and check their transcripts. Registrars manage course offerings, assign instructors, and handle tuition records. We built this system in NetBeans, combining a clean UI with strong backend validation. It was a team effort between Pranjal Patil, Chinmay Sakhare, and Anisha Gaikar, focusing on collaboration, accuracy, and usability. We faced challenges like access control logic, GPA calculation, and refund handling, but solved them through clear structure and consistent testing. The result is a fully functional digital university model that mirrors real-world academic systems. Going forward, we plan to connect it to a live database, add a web interface, and integrate email notifications. Overall, this project helped us understand not just coding, but also teamwork, problem-solving, and building software that feels real and reliable.




2. Team Information
Name	NUID		Responsibilities
Anisha Gaikar	002560573		Faculty UI, grading automation, and performance reporting
Chinmay Sakhare	002594857		Student management module and authentication system
Pranjal Patil	002597593	  	Admin panel, course assignment, and database integration
________________________________________
3. Project Overview
Purpose & Objectives
This project is designed to automate course and faculty management within an academic institution. It allows administrators, faculty, and students to interact through a unified platform that manages course data, grades, reports, and performance analytics.
Key Features
•	Secure login and role-based access control
•	Faculty dashboard to manage courses, students, and grades
•	Automatic computation of GPA and ranking
•	Admin dashboard for managing users and courses
•	Exportable reports and analytics
________________________________________
4. Installation & Setup Instructions
Prerequisites
•	Java JDK 17 or above
•	Apache NetBeans IDE (v15 or later)
•	MySQL Database (or Derby)
•	JDBC Connector Library
Setup Steps
1.	Clone the repository:
2.	git clone https://github.com/yourusername/faculty-course-management.git
3.	Open the project in NetBeans IDE.
4.	Ensure the JDK and JDBC libraries are correctly added to your project.
5.	Configure the database connection in DatabaseConnection.java.
6.	Run the main class:
7.	src/UserInterface/Main.java
8.	Use default credentials for first login (Admin):
9.	Username: admin
10.	Password: admin123
________________________________________
5. Authentication & Access Control
Authentication Process
•	Each user logs in using a unique username and password.
•	The system validates credentials from the user database.
•	After login, the user is redirected to their respective dashboard.
•	Logout is available from all dashboards to end the session securely.
Authorization Rules
Role	Permissions
Admin	Create/assign courses, manage users, generate system reports
Faculty	Manage course info, view students, assign grades, generate reports
Student	View enrolled courses, grades, and performance
________________________________________
6. Features Implemented
Admin
•	Add/edit/delete faculty and student records
•	Create and assign courses
•	View system-wide reports
Implemented by: Pranjal Patil
Faculty
•	Manage courses (view, edit, upload syllabus)
•	Generate performance reports and view class GPA
•	Grade students automatically using grade computation module

Implemented by: Anisha Gaikar
Student
•	View assigned courses and performance summary
•	Download report cards
Implemented by: Chinmay Sakhare
________________________________________
7. Usage Instructions
Login
•	Launch the application and enter your credentials.
Example Scenarios
•	Faculty: Log in → Select a course → Upload grades → Generate report.
•	Student: Log in → View enrolled courses → Check GPA.
•	Admin: Log in → Add faculty → Assign course → View analytics dashboard.
________________________________________
8. Testing Guide
How to Test
1.	Run the application using NetBeans.
2.	Test each user role (Admin, Faculty, Student) with dummy accounts.
3.	Verify login authentication and session management.
4.	Check authorization restrictions (e.g., students cannot access faculty pages).
5.	Validate auto-grade calculation and GPA computation.
Sample Test Case
Test Case	Input	Expected Output	Result
Faculty login	Username: prof1, Password: test123	 Redirect to Faculty Dashboard	 ✅
Grade calculation	85%, 90%, 95%	 Average = A Grade	 ✅
Unauthorized access	Student tries to open Admin panel	 “Access Denied” message	 ✅
________________________________________
9. Challenges & Solutions
Challenge	Solution
Database connection errors	Configured JDBC driver and verified schema consistency
UI layout alignment issues	Used GridBagLayout for uniform spacing
Auto-grade logic complexity	Implemented modular grade calculation function
________________________________________
10. Future Enhancements
•	Add email notifications for grade release.
•	Integrate AI-based student performance prediction.
•	Enable cloud-based data storage (AWS RDS).
•	Add PDF report export using iText library.
________________________________________



11. Contribution Breakdown
Member	Contribution Area	Details
Anisha Gaikar	Faculty module, UI design, grading logic	Designed faculty dashboard, developed report generation
Chinmay Sakhare	Authentication, Student module	Implemented login/logout, session management, student portal
Pranjal Patil	Admin module, database integration	Created CRUD operations, database schema, and admin reports
All Members	Documentation & Testing	README creation, test cases, code debugging

s