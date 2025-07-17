package com.alaw810.ex5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerializer {
    public static void serializePerson(Person person, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Person serialized successfully to " + filePath);

        } catch (IOException e) {
            System.out.println("Error serializing person: " + e.getMessage());
        }
    }
}
