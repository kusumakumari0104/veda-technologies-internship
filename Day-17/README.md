
# Day 17 - Practice ArrayList with an Inventory System

## Description
Create an Inventory Management System using Java `ArrayList` to add, remove, search, update, and display products.

## Objective
- Learn dynamic collections in Java.
- Understand CRUD operations.
- Practice object-oriented programming.
- Implement product search using unique IDs.

## Technologies Used
- Java
- ArrayList
- Scanner
- Classes and Objects

## Features
1. **Add Product** - Add a new product with ID, name, price, and quantity.
2. **Display Products** - Display all products in the inventory.
3. **Search Product** - Find a product using its ID.
4. **Update Product** - Modify existing product details.
5. **Remove Product** - Delete a product using its ID.
6. **Exit** - Close the application.

## How to Run

### Step 1: Compile the Program
```bash
javac InventorySystem.java
```

### Step 2: Run the Program
```bash
java InventorySystem
```

## Sample Output

```text
===== INVENTORY MANAGEMENT SYSTEM =====
1. Add Product
2. Display Products
3. Search Product
4. Update Product
5. Remove Product
6. Exit
Enter your choice: 1

Enter Product ID: 101
Enter Product Name: Laptop
Enter Price: 45000
Enter Quantity: 5
Product added successfully!

===== INVENTORY MANAGEMENT SYSTEM =====
1. Add Product
2. Display Products
3. Search Product
4. Update Product
5. Remove Product
6. Exit
Enter your choice: 2

ID         Name                 Price        Quantity
101        Laptop               45000.00     5
```

## Time Complexity

| Operation | Time Complexity |
|---|---|
| Add Product | O(n) |
| Display Products | O(n) |
| Search Product | O(n) |
| Update Product | O(n) |
| Remove Product | O(n) |

Here, `n` represents the number of products in the inventory.

## Concepts Learned
- Java ArrayList
- Classes and Objects
- CRUD Operations
- Searching by Product ID
- Methods and Loops
- Switch Statements
- Dynamic Collections

## Future Enhancements
- Save product data permanently in a file or database.
- Add input validation.
- Calculate total inventory value.
- Sort products by name or price.

## Conclusion
This project demonstrates how Java ArrayList can be used to develop a basic inventory application with CRUD operations and product search functionality.
