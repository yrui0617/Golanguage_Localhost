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

## Docker image
  **to ensure that web application can be run locally without any environment issue**
  
  - **1.Write the following command to pull docker image in the terminal of intellij:**
      ````bash
      docker pull yrui0617/finalproject:latest
  - **2.You can run the docker container after download the docker image by write the following command in the terminal of intellij：**
      ````bash
      run -d -p 8080:8080 yrui0617/finalproject:latest
  - **3.If the docker container run successfully, you can go to the url provided in the web browser, it will directly go to index.html:**
      ````bash
      http://localhost:8080
