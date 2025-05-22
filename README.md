# ✅ ToDoList

A clean and minimal Spring Boot app to track your tasks — add them, finish them, or yeet them out.

---

## 📖 Table of Contents

- [🧾 Overview](#-overview)
- [📌 Features](#-features)
- [🔧 REST Endpoints](#-rest-endpoints)
- [📥 Sample Requests](#-sample-requests)
- [💻 Prerequisites](#-prerequisites)
- [📁 How to Use This Project](#-how-to-use-this-project)
- [🔭 Next Steps](#-next-steps)

---

## 🧾 Overview

This project is a simple Spring Boot REST API to manage a ToDo list. You can add new tasks, view all tasks, update them, or remove them — all data is stored in-memory for rapid testing.

---

## 📌 Features

- 📋 Add new tasks
- 🔄 Update task title or mark as done
- 🗑️ Delete tasks you no longer need
- 🧾 List everything you're juggling
- 🧠 In-memory list simulates basic storage

---

## 🔧 REST Endpoints

| Method | Endpoint        | Description           |
|--------|------------------|-----------------------|
| GET    | /todos           | View all tasks        |
| POST   | /todos           | Add a new task        |
| PUT    | /todos/{id}      | Update a task         |
| DELETE | /todos/{id}      | Remove a task         |

---

## 📥 Sample Requests

### ➕ Add Task

```http
POST /todos
Content-Type: application/json

{
  "title": "Refactor controller",
  "completed": false
}
```

### 📋 Get All Tasks

```http
GET /todos
```

Returns:

```json
[
  {
    "id": 1,
    "title": "Refactor controller",
    "completed": false
  }
]
```

### ✏️ Update Task

```http
PUT /todos/1
Content-Type: application/json

{
  "title": "Controller updated",
  "completed": true
}
```

### ❌ Delete Task

```http
DELETE /todos/1
```

---

## 💻 Prerequisites

- Java 17+ and Spring Boot 3.x  
- A REST client like Postman or browser for testing  
- IDE like IntelliJ, Eclipse, or VS Code  

---

## 📁 How to Use This Project

1. Clone this repository or pull the branch that contains the project:

```bash
git clone https://github.com/sanxjay-xy/SprintTrack.git
```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

3. Make sure you have Java 17+ and Maven installed

4. Run the Spring Boot application using:

```bash
mvn spring-boot:run
```

5. Use a REST client like Postman or your browser to test the endpoints

---

## 🔭 Next Steps

We can extend this by:
- Adding timestamps for task creation or completion  
- Adding priority or labels to tasks  
- Connecting to a database (like H2 or PostgreSQL)  
- Implementing user authentication for personal task lists  

> 🚀 A smooth intro project to REST APIs with Spring Boot — lightweight, fast, and extendable.
