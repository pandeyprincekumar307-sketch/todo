# 📝 Todo Application

A simple and user-friendly **Todo Application** built using **Java and Spring Boot**.
The application allows users to create, view, update, and delete tasks while keeping track of their task status.

## 🚀 Features

* ✅ Add new tasks
* 📋 View all tasks
* ✏️ Update task details
* 🗑️ Delete tasks
* 🔄 Manage task status
* 🎯 Set task priority
* 🌐 Simple and responsive user interface
* 🔒 Backend developed using Spring Boot

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Thymeleaf**
* **HTML5**
* **CSS3**
* **Bootstrap**
* **Maven**

## 📂 Project Structure

```text
todo-application/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/todo/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── model/
│   │   │       └── TodoApplication.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       ├── static/
│   │       └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/todo-application.git
```

### 2. Open the Project

Open the project in:

* IntelliJ IDEA
* Eclipse
* Spring Tool Suite
* VS Code

### 3. Configure the Application

Update the required configuration in:

```text
src/main/resources/application.properties
```

### 4. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main Spring Boot class:

```java
TodoApplication.java
```

### 5. Open in Browser

```text
http://localhost:8080/
```

## 📌 Application Workflow

```text
User
  ↓
Todo UI
  ↓
Controller
  ↓
Service
  ↓
Database / Data Storage
```

## 🎯 Main Operations

| Operation   | Description                    |
| ----------- | ------------------------------ |
| Add Task    | Creates a new todo task        |
| View Tasks  | Displays all available tasks   |
| Update Task | Modifies task information      |
| Delete Task | Removes a task                 |
| Status      | Tracks Pending/Completed tasks |
| Priority    | Assigns task priority          |

## 📸 Screenshots

Add screenshots of your application here:

```text
screenshots/
├── home.png
├── add-task.png
└── edit-task.png
```

## 🔮 Future Enhancements

* User authentication and registration
* Database integration with MySQL
* Task search and filtering
* Task deadlines
* Email notifications
* REST API integration
* JWT-based authentication
* Docker deployment

## 👨‍💻 Developer

**Prince Kumar Pandey**

Java Full Stack Developer

## 📄 License

This project is created for educational and learning purposes.
