README - Java Utils Exercises

📄 Description:
Exercise 1: This program lists the contents of a directory in alphabetical order.
It receives the directory path as a command-line argument.

Exercise 2: This program recursively lists all files and subdirectories
from a given directory, indicating whether each item is a file or directory,
and showing its last modified date.

Exercise 3: This program performs the same recursive listing as Exercise 2,
but instead of printing to the console, it writes the result to a text file named
"directory_tree.txt" located in the "output" folder of the project.

---

🛠️ Compilation:

From the root of the project, run the following command:

    javac -d out src/com/alaw810/ex1/*.java
    javac -d out src/com/alaw810/ex2/*.java
    javac -d out src/com/alaw810/ex3/*.java

These commands compile all .java files and store the .class files in the "out" folder.

---

▶️ Execution:

To run the programs, use the commands:

    java -cp out com.alaw810.ex1.MainEx1 <directory_path>
    java -cp out com.alaw810.ex2.MainEx2 <directory_path>
    java -cp out com.alaw810.ex3.MainEx3 <directory_path>

Examples:

    java -cp out com.alaw810.ex1.MainEx1 ./src
    java -cp out com/alaw810/ex2.MainEx2 ./src
    java -cp out com.alaw810.ex3.MainEx3 ./src

The first example lists the contents of the "./src" directory.
The second example recursively lists all contents of "./src" with type and last modified date.
The third example performs the same operation as Exercise 2, but saves the output to a file.

---

📌 Notes:
- Use relative paths when possible.
- If the provided path is not a valid directory, an error message will be displayed.
- The listing is sorted alphabetically within each directory level.
- For Exercise 3, make sure the folder "output" with the file "directory_tree.txt" exists in the root of the project.
