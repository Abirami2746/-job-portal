
# 🧑‍💼 Job Portal Web Application

A simple **Job Portal** built using **Spring Boot**, **JSP**, and **MySQL**, developed in **Eclipse IDE**.  
This project allows employers to post job openings and users to view and apply for jobs easily.

---

## 🚀 Features

- User Registration and Login  
- Employer Job Posting  
- Job Search and Apply  
- Simple JSP Frontend  
- Integrated with MySQL Database  
- Runs on Spring Boot (Embedded Tomcat)

---

## 🏗️ Technologies Used

| Layer | Technology |
|-------|-------------|
| **Frontend** | JSP, HTML, CSS, Bootstrap |
| **Backend** | Java, Spring Boot, Spring MVC |
| **Database** | MySQL |
| **IDE** | Eclipse IDE for Enterprise Java Developers |
| **Build Tool** | Maven |
| **Server** | Apache Tomcat (Embedded) |

---

## ⚙️ Project Structure

```

JobPortal/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java
│   │   │   ├── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   ├── test/java/com/example/demo/
│   │   └── DemoApplicationTests.java
├── index.jsp
├── apply.jsp
├── application.jsp
├── pom.xml
└── README.md

````

---

## ⚙️ How to Run the Project

### 🧰 Prerequisites
- Java JDK 17 or higher  
- MySQL Server  
- Eclipse IDE (Enterprise Edition)  
- Maven installed and configured  

### 🪄 Steps to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/job-portal.git
   cd job-portal
````

2. **Import into Eclipse**

   * Open Eclipse → File → Import → Maven → Existing Maven Projects
   * Select the project folder → Finish

3. **Database Configuration**

   * Create a MySQL database, e.g. `job_portal_db`
   * Update your `application.properties` file:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/job_portal_db
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```

4. **Run the Project**

   * Right-click on `DemoApplication.java`
   * Select **Run As → Spring Boot App**

5. **Access the Application**

   * Open your browser → [http://localhost:8080](http://localhost:8080)

---

## 🧪 Testing

To run tests:

```bash
mvn test
```

---

## 📸 Sample JSP Pages

* `index.jsp` – Home page
* `apply.jsp` – Apply for jobs
* `application.jsp` – View application details

---

## 🔮 Future Enhancements

* Email notifications for job applications
* Resume upload system
* Admin dashboard for managing users and listings
* REST API for mobile app integration

---

## 🧑‍💻 Author
Abirami Ramesh
📧 [abirami2746@gmail.com]
🌐 [LinkedIn Profile](https://linkedin.com/in/abiramiramesh2746)

---


---




