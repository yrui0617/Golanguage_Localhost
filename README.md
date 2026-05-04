# GoLanguage
  - a web application designed to help users learn and practice a new language.


## Project Features
This website supports the following features:

**1.User Authentication**
  - Register and log in with email and password
  - "Remember Me" to stores the user's email and password in local storage and auto-fill the user details at login page next time. 

**2.Language Learning**
  - Malay and Chinese available can be selected to learn a new language
  - Real-time progress tracking and feedback (prompt user to select correct answer and navigate to next question or finish until the correct answer was chosen.)
  - **Exercise Types**
    - Multiple Choose Question
    - Fill The Blank
    - Reading Exercise
    - Listeninf Exercise

**3.Achievements**
  - Track completed exercises
  - Store completion time of achievement using server timestamp
  - Display each achievement that completed by specific user
 
**4.User Profile**
  - Show all the user information
  - Allow user to edit their information
  - Upload/Remove the profile picture
  

---

# 🔧 Setup Instructions

##  Change MySQL Database Configuration at application.properties (/src/main/resources)
  - spring.datasource.url=jdbc:mysql://localhost:3307/golanguage_db?useSSL=false&serverTimezone=Asia/Kuala_Lumpur
    - Change to your MySQL port like change 3307 by 3306
  - spring.datasource.username=root
    - Change to your MySQL username
  - spring.datasource.password=yourpassword   #
    - Change to your MySQL password

# 🖼️ Picture for UI
  - Home Page
  <img width="1918" height="865" alt="image" src="https://github.com/user-attachments/assets/5b055ea0-b058-401f-8f39-5fb7f28293ea" />

  - Login Page
  <img width="1899" height="867" alt="image" src="https://github.com/user-attachments/assets/f72bf728-8d44-4800-a216-2e9b7b7a33b0" />

  - Language Selection
  <img width="1915" height="871" alt="image" src="https://github.com/user-attachments/assets/307e83c6-f169-4c5e-b13a-a5a16baf483f" />

  - Dashboard
  <img width="1915" height="865" alt="image" src="https://github.com/user-attachments/assets/64da5bc8-4c97-49d9-849d-3f31af04e768" />

  - Exercise
  <img width="1895" height="869" alt="image" src="https://github.com/user-attachments/assets/4baaf7e1-90b6-4e01-ae72-542f28dd113e" />

  - Achievement
  <img width="1913" height="864" alt="image" src="https://github.com/user-attachments/assets/a112d11d-edde-49d2-8645-4c35d7c4a5fa" />

  - User Profile
  <img width="1918" height="867" alt="image" src="https://github.com/user-attachments/assets/bc73cc54-7082-4cd9-8a23-e784742ad0ab" />

  - About us
  <img width="1914" height="868" alt="image" src="https://github.com/user-attachments/assets/f8a93878-09e4-4799-8d2a-ab3d4036ec9f" />









