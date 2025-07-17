package com.alaw810.ex5;

public class MainEx5 {
    public static void main(String[] args) {
        String filePath = "output/person.ser";

        Person original = new Person("Adrià", 32);
        PersonSerializer.serializePerson(original, filePath);

        Person loaded = PersonDeserializer.deserializePerson(filePath);
        if (loaded != null) {
            System.out.println("Deserialized person: " + loaded);
        }
    }
}
