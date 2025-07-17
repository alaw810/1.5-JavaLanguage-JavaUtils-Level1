package com.alaw810.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class MainEx1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory path as an argument.");
            return;
        }

        String path = args[0];

        DirectoryLister lister = new DirectoryLister(path);

        try {
            ArrayList<String> files = lister.listDirectory();

            for (String file : files) {
                System.out.println(file);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
