# MediaTeca management system
## description 
This project is a console-based java application that simulates a **library media management system**.
## Features
the application allow the user to: 
1. Show the catalog
2. Add new item
3. Modify an item´s title
4. Borrow an item
5. Return an item and calculate late fines
6. Exit the program
## Class structure
Abstract class
- `ItemBiblioteca`
Subclases:
- `Libro`
- `Revista`
- `DVD`

Each type of item has different **loan periods** and **late fines**.
