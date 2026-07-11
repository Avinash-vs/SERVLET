# Java Servlet Addition Calculator 🧮

A simple Java Web Application that demonstrates how to pass data from a frontend HTML form to a backend Java Servlet using the `POST` method. 

## 🚀 Features
* **Frontend:** Takes two integer inputs from the user via a simple HTML form.
* **Backend:** Processes the request using a Java Servlet, calculates the sum, and dynamically generates an HTML response to display the result.
* **Server:** Configured to run on Apache Tomcat v10.1.

## 🛠️ Technologies Used
* **Language:** Java 17
* **API:** Jakarta EE (Servlets)
* **Frontend:** HTML5
* **Server:** Apache Tomcat v10.1
* **IDE:** Eclipse IDE for Enterprise Java

## 📁 Project Structure
This project follows a standard Maven-style directory layout for web applications:

```text
Servlet_2/
├── src/main/java/
│   └── Demo/
│       └── Tester.java       # The backend Servlet (Mapped to "/avi")
│
└── src/main/webapp/
    ├── Front.html            # The user input form
    └── WEB-INF/              # Server configuration folder
