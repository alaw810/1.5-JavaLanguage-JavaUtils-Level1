README - Exercise 1

📄 Description:
This program lists the contents of a directory in alphabetical order.
It receives the directory path as a command-line argument.

---

🛠️ Compilation:

From the root of the project, run the following command:

    javac -d out src/com/alaw810/ex1/*.java

This command compiles all .java files and stores the .class files in the "out" folder.

---

▶️ Execution:

To run the program, use the command:

    java -cp out com.alaw810.ex1.MainEx1 <directory_path>

Example:

    java -cp out com.alaw810.ex1.MainEx1 ./src

This will list the contents of the "./src" directory in alphabetical order.

---

📌 Notes:
- Use relative paths when possible.
- If the provided path is not a valid directory, an error message will be displayed.
