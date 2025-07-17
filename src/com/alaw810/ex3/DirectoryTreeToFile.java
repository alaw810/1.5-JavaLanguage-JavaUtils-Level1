package com.alaw810.ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTreeToFile {

    public static void listDirectoryTreeToFile(File dir, BufferedWriter writer, String indent) throws IOException {
        File[] entries = dir.listFiles();
        if (entries == null) {
            writer.write("Cannot access contents of: " + dir.getPath());
            writer.newLine();
            return;
        }

        Arrays.sort(entries);

        for (File entry : entries) {
            String type = entry.isDirectory() ? "D" : "F";
            String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date(entry.lastModified()));

            writer.write(indent + type + " - " + entry.getName() + " (Last modified: " + lastModified + ")");
            writer.newLine();

            if (entry.isDirectory()) {
                listDirectoryTreeToFile(entry, writer, indent + "    ");
            }
        }
    }
}
