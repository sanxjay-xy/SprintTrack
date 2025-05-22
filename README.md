# 🎟️ Ticket Booking System

A lightweight Spring Boot REST API to book, cancel, and view tickets — all handled in memory with zero setup. This mini-project is great for learning request handling and object mapping in Spring.

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

This project demonstrates a simple ticket booking logic using Spring Boot. It allows us to book a ticket, cancel it, or view the ticket details based on a unique ticket number — all stored in-memory without a database.

---

## 📌 Features

- ✅ Book a ticket with name and ticket number  
- ❌ Cancel a ticket by ticket number  
- 🔍 View ticket info by ticket number  
- 🧠 In-memory list simulates basic storage  

---

## 🔧 REST Endpoints

| Method | Endpoint              | Description                        |
|--------|------------------------|------------------------------------|
| POST   | `/ticket/book`         | Book a new ticket                  |
| DELETE | `/ticket/cancel`       | Cancel an existing ticket          |
| GET    | `/ticket/view/{id}`    | View ticket details by ticket no   |

---

## 📥 Sample Requests

### 🎫 Book a Ticket

```http
POST /ticket/book
Content-Type: application/json

{
  "name": "Sanjay",
  "ticketNo": "RA2111003020575"
}
```

### 🔍 View Ticket

```http
GET /ticket/view/RA2111003020575
```

### ❌ Cancel Ticket

```http
DELETE /ticket/cancel
Content-Type: application/json

{
  "name": "Sanjay",
  "ticketNo": "RA2111003020575"
}
```

---

## 💻 Prerequisites

- Java 17+ and Spring Boot 3.x  
- A REST client (Postman, Insomnia) or browser for testing  
- IDE like IntelliJ, Eclipse, or VS Code  

---

## 📁 How to Use This Project

1. Clone this repository or pull the branch that contains the project:

```bash
git clone https://github.com/your-username/your-repo-name.git
```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

3. Make sure you have Java 17+ and Maven installed

4. Run the Spring Boot application using:

```bash
mvn spring-boot:run
```

5. Use a REST client like Postman or your browser to test the endpoints

6. Example test – to book a ticket:

```http
POST /ticket/book
Content-Type: application/json

{
  "name": "Sanjay",
  "ticketNo": "RA2111003020575"
}
```

---

## 🔭 Next Steps

We can extend this by:
- Adding date/time of booking  
- Persisting data with H2 or MySQL  
- Validating duplicate names or ticket numbers with better error responses  

> 🚀 A great stepping stone toward real-world Spring Boot backend systems.
