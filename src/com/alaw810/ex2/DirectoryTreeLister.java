package com.alaw810.ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTreeLister {

    public static void listDirectoryRecursively(File dir, int level) {
        if (!dir.isDirectory()) {
            System.out.println("The path provided is not a directory.");
            return;
        }

        File[] entries = dir.listFiles();
        if (entries == null) {
            System.out.println("Could not access directory: " + dir);
            return;
        }

        Arrays.sort(entries);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for (File entry : entries) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }

            String type = entry.isDirectory() ? "D" : "F";
            String lastModified = sdf.format(new Date(entry.lastModified()));
            System.out.println(type + " " + entry.getName() + " - " + lastModified);

            if (entry.isDirectory()) {
                listDirectoryRecursively(entry, level + 1);
            }
        }
    }
}
