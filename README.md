# 📝 Java Notes App (File I/O Project)

## 📌 Objective
A simple console-based Notes App written in Java that allows users to:
- Add text notes
- View saved notes

The application uses Java's **File I/O** (`FileWriter`, `FileReader`, `BufferedReader`) to persist data between runs.

---

## 🛠 Tools Used

- Java
- VS Code / Any IDE
- Terminal or Command Prompt

---

## 💡 Key Concepts

- File I/O (Read/Write)
- Exception Handling
- BufferedReader vs FileReader
- Append vs Overwrite mode
- Try-with-resources
- Stack Trace and Logging

---

## 📂 Project Structure

NotesApp/
├── NotesApp.java
├── notes.txt # Automatically created after running
└── README.md


---

## ▶️ How to Run

1. **Open Terminal** in the project directory.
2. Compile the code:
   ```bash
   javac -d . NotesApp/*java
   java NotesApp.NotesApp

