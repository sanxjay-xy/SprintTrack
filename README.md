# 🍽️ RestaurantSystem

Build your order cart like it’s Zomato — minus the delivery guy. This Spring Boot REST API handles menus and simple ordering.

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

This project provides a simple in-memory backend for managing restaurant menu items and a customer cart. Add items to your order and view what you've selected — no database, no persistence, just quick functionality.

---

## 📌 Features

- 📋 View available menu items
- 🛒 Add items to your cart
- 👀 Check your current order
- 🧹 Cart resets on server restart

---

## 🔧 REST Endpoints

| Method | Endpoint                  | Description             |
|--------|---------------------------|-------------------------|
| GET    | /restaurant/menu          | View all menu items     |
| POST   | /restaurant/order/add     | Add item to order cart  |
| GET    | /restaurant/order         | View current cart/order |

---

## 📥 Sample Requests

### 📋 View Menu

```http
GET /restaurant/menu
```

Returns:

```json
[
  { "name": "Burger", "price": 50 },
  { "name": "Pizza", "price": 115 },
  { "name": "Pasta", "price": 44.90 }
]
```

### ➕ Add Item to Cart

```http
POST /restaurant/order/add
Content-Type: application/json

{
  "name": "Pizza"
}
```

### 🛒 View Current Cart

```http
GET /restaurant/order
```

Returns:

```json
[
  { "name": "Pizza", "price": 115 }
]
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
- Adding quantities or total prices
- Adding remove-from-cart functionality
- Adding basic authentication
- Persisting data with a database

> 🍴 Lightweight, fast, and easy to scale — your backend base for restaurant systems.
