# 🍽️ Restaurant Menu & Order System

A simple and clean Spring Boot REST API that lets you browse a menu, add items to your cart, and view your current order — no frontend or database needed.

---

## 📋 What You Can Do

- 🍔 View a preset menu of items
- 🛒 Add dishes to your cart
- 📦 See your full order before checkout
- 🔁 Works entirely in-memory — quick to test & reset

---

## 🧾 Sample Menu (Preloaded)

| Item   | Price  |
|--------|--------|
| Burger | ₹50.00 |
| Pizza  | ₹115.00|
| Pasta  | ₹44.90 |

---

## 🔧 REST Endpoints

| Method | Endpoint                      | Description              |
|--------|-------------------------------|--------------------------|
| GET    | `/restaurant/menu`            | View full menu items     |
| POST   | `/restaurant/order/add`       | Add item to your cart    |
| GET    | `/restaurant/order`           | View your current order  |

---

## 📥 Sample JSON (POST `/restaurant/order/add`)

```json
{
  "name": "Pizza"
}
