# 📚 Library Tracker System - Java Console App

This project is a console-based Java application designed for managing a library system, which tracks:
- Users borrowing books
- Feedback provided on books
- Unique book titles
- Book return process
- Book search by keyword
- Deletion of users

## ✅ Features

### Core Functionality:
- Add new books and users
- Record and analyze feedback (requires minimum 3 words)
- Display books borrowed by a user
- Display all unique book titles borrowed

### Extended Functionality:
- Return a borrowed book
- Search books by title keyword
- Delete a user from the system

## 🧱 Classes

### `Book`
Represents a book with ID, title, and author.

### `User`
Represents a user with ID, name, list of borrowed book IDs, and a feedback map.

### `LibraryManager`
Handles all operations like adding/removing users or books, recording feedback, showing unique titles, and searching books.

## 🚀 How to Run
1. Compile all `.java` files
2. Create a `Main` class and initialize `LibraryManager`, users, and books
3. Call functions like `addUser`, `recordFeedback`, `returnBook`, etc.

## 🛠️ Sample Main Setup (Not Included)
```java
LibraryManager manager = new LibraryManager();
manager.addBook(new Book("B101", "Java Basics", "James Gosling"));
manager.addUser(new User("U001", "Anil", new ArrayList<>(Arrays.asList("B101"))));
manager.recordFeedback("U001", "B101", "Very good book on Java.");
```

## 📌 Note
- Avoid using `Arrays.asList()` directly when you plan to modify the list (use `new ArrayList<>(...)` instead).
- Feedback must have at least 3 words.
