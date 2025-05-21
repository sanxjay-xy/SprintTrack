# 🎟️ Ticket Booking System

A lightweight Spring Boot REST API to book, cancel, and view tickets — all handled in memory with zero setup. This mini-project is great for learning request handling and object mapping in Spring.

---

## 📖 Table of Contents

- 🧾 [Overview](#overview)
- 📌 [Features](#features)
- 🔧 [REST Endpoints](#rest-endpoints)
- 📥 [Sample Requests](#sample-requests)
- 💻 [Prerequisites](#prerequisites)
- 📁 [How to Use This Project](#how-to-use-this-project)
- 🔭 [Next Steps](#next-steps)

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
