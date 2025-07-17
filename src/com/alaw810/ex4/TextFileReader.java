package com.alaw810.ex4;

import java.io.*;

public class TextFileReader {

    public static void readTextFile(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            throw new IOException("File does not exist or is not a valid file: " + filePath);
        }

        if (!filePath.endsWith(".txt")) {
            throw new IOException("Only .txt files are supported.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
