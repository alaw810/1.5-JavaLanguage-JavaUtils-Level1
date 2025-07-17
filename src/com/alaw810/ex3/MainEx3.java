package com.alaw810.ex3;

import java.io.*;

public class MainEx3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java com.alaw810.ex3.MainEx3 <directory_path>");
            return;
        }

        File inputDir = new File(args[0]);
        if (!inputDir.exists() || !inputDir.isDirectory()) {
            System.out.println("Invalid directory: " + inputDir.getPath());
            return;
        }

        String outputFilePath = "output" + File.separator + "directory_tree.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            DirectoryTreeToFile.listDirectoryTreeToFile(inputDir, writer, "");
            System.out.println("Directory tree saved to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
