package com.alaw810.ex5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserializer {
    public static Person deserializePerson(String filePath) {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            return (Person) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing person: " + e.getMessage());
            return null;
        }
    }
}
