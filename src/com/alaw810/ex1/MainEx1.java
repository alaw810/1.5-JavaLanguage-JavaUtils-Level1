package com.alaw810.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class MainEx1 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MainEx1 <directory path>");
            return;
        }

        String path = args[0];

        try {
            ArrayList<String> files = DirectoryLister.listDirectory(path);
            for (String file : files) {
                System.out.println(file);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
