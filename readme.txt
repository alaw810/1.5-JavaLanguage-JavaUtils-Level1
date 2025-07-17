README - Java Utils Exercises

📄 Description:

📌 Exercise 1: Lists the contents of a directory in alphabetical order.
Receives the directory path as a command-line argument.

📌 Exercise 2: Recursively lists all files and subdirectories from a given directory,
indicating whether each item is a file or directory, and showing its last modified date.

📌 Exercise 3: Performs the same recursive listing as Exercise 2,
but instead of printing to the console, it writes the result to a text file named
"directory_tree.txt" located in the "output" folder of the project.

📌 Exercise 4: Reads a .txt file passed as a command-line argument
and prints its contents to the console line by line.

📌 Exercise 5: Serializes a Java object to a .ser file and deserializes it,
restoring the object and printing it to the console.

---

🛠️ Compilation:

From the root of the project, run the following commands:

    javac -d out src/com/alaw810/ex1/*.java
    javac -d out src/com/alaw810/ex2/*.java
    javac -d out src/com/alaw810/ex3/*.java
    javac -d out src/com/alaw810/ex4/*.java
    javac -d out src/com/alaw810/ex5/*.java

These commands compile all .java files and store the .class files in the "out" folder.

---

▶️ Execution:

To run the programs, use the commands:

    java -cp out com.alaw810.ex1.MainEx1 <directory_path>
    java -cp out com.alaw810.ex2.MainEx2 <directory_path>
    java -cp out com.alaw810.ex3.MainEx3 <directory_path>
    java -cp out com.alaw810.ex4.MainEx4 <path_to_txt_file>
    java -cp out com.alaw810.ex5.MainEx5

Examples:

    java -cp out com.alaw810.ex1.MainEx1 ./src
    java -cp out com.alaw810.ex2.MainEx2 ./src
    java -cp out com.alaw810.ex3.MainEx3 ./src
    java -cp out com.alaw810.ex4.MainEx4 output/directory_tree.txt
    java -cp out com.alaw810.ex5.MainEx5

---

📌 Notes:
- Use relative paths when possible.
- If the provided path is not a valid directory or file, an error message will be displayed.
- The listing is sorted alphabetically within each directory level.
- For Exercise 3, make sure the folder "output" with the file "directory_tree.txt" exists in the root of the project.
- Exercise 5 creates a file named "person.ser" and restores its contents to the console.
