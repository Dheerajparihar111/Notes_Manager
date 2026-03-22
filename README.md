# 📝 Note Manager 

A professional **Command Line Interface (CLI) Note Manager** built using **Java** with Object-Oriented Programming and File Handling.
This project allows users to create, search, view, and delete notes, with automatic saving to file.

The system stores notes in a text file so that data remains saved even after closing the program.

---

## 🚀 Features

✔️ Add Note
✔️ View Notes (index starts from 1)
✔️ Search Note by keyword
✔️ Delete Note
✔️ Auto save to file
✔️ Load notes on start
✔️ Menu-driven CLI interface
✔️ OOP based design
✔️ File handling support

---

## 🛠️ Technologies Used

* ☕ Java
* 💻 Command Line Interface (CLI)
* 📥 Scanner class
* 📂 File handling (File, Scanner, PrintWriter)
* 📚 ArrayList
* 🧱 OOP (Class & Object)
* 🔁 Loops & Switch case

---

## 📂 Project Structure

```
NoteManager
│
├── Main.java
├── Note.java
├── notes.txt
```

* `Main.java` → Menu & logic
* `Note.java` → Note class
* `notes.txt` → Stored notes file

---

## ⚙️ Menu Options

```
===== NOTE MANAGER =====

1 Add Note
2 View Notes
3 Search Note
4 Delete Note
5 Exit
```

---

## 📌 How It Works

* Notes are stored in an **ArrayList**
* When program exits → notes saved to file
* When program starts → notes loaded from file
* Search works using keyword match

---

## ▶️ How to Run

### 1. Compile

```
javac Main.java Note.java
```

### 2. Run

```
java Main
```

---

## 💻 Example Output

```
===== NOTE MANAGER =====

1 Add Note
2 View Notes
3 Search Note
4 Delete Note
5 Exit

Enter choice: 1

Enter note:
Buy groceries
```

```
===== NOTE MANAGER =====

Enter choice: 2

1 : Buy groceries
```

```
===== NOTE MANAGER =====

Enter choice: 3

Enter keyword: Buy

1 : Buy groceries
```
Link : https://github.com/Dheerajparihar111/Notes_Manager
---

## 🎯 Learning Concepts

* Object Oriented Programming
* File Handling in Java
* ArrayList usage
* Menu driven programs
* String searching
* Real world CLI project

---


## 👨‍💻 Author

Dheeraj Parihar
Electronics & Telecommunication Engineering Student
Interested in Java, CLI tools, and software development.

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub.
