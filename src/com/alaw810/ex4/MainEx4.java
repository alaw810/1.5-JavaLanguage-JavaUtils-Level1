package com.alaw810.ex4;

import java.io.IOException;

public class MainEx4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java com.alaw810.ex4.MainEx4 <file_path>");
            return;
        }

        String filePath = args[0];

        try {
            TextFileReader.readTextFile(filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
