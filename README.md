# 🏨 HostelReservation

Manage students and rooms like a boss with this Spring Boot REST API built for hostel logistics.

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

This project simulates a basic hostel room booking system. Students can register and request rooms based on their preferences. Available rooms are auto-assigned on a first-come-first-serve basis.

---

## 📌 Features

- 👤 Register students with gender, age, and room preference
- 🛏️ Auto-assign rooms (Single/Double)
- 🧹 Check-out to free a room
- 📄 View student list and room statuses
- 🧠 All data lives in-memory — resets on restart

---

## 🔧 REST Endpoints

| Method | Endpoint               | Description                   |
|--------|------------------------|-------------------------------|
| POST   | /hostel/register       | Register a new student        |
| POST   | /hostel/checkout/{num} | Checkout by room number       |
| GET    | /hostel/students       | View all registered students  |
| GET    | /hostel/rooms          | View all room statuses        |

---

## 📥 Sample Requests

### 📝 Register Student

```http
POST /hostel/register
Content-Type: application/json

{
  "name": "Riya",
  "age": 19,
  "gender": "Female",
  "preference": "Single"
}
```

### 🚪 Checkout Student

```http
POST /hostel/checkout/1
```

Response:
```
Checked out from room 1
```

### 📄 View Students

```http
GET /hostel/students
```

### 🛏️ View Room Status

```http
GET /hostel/rooms
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

You can enhance this by:
- Adding different room pricing
- Adding room sharing logic for doubles
- Persisting data using a database
- Validating input for edge cases

> 🏨 A neat little system for managing hostel flows — clean, fast, and extendable.
