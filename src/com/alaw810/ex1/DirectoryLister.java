package com.alaw810.ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DirectoryLister {

    public static ArrayList<String> listDirectory(String path) throws IOException {
        File directory = new File(path);

        if (!directory.isDirectory()) {
            throw new IOException("The path provided is not a directory.");
        }

        String[] files = directory.list();
        if (files == null) {
            throw new IOException("The directory could not be accessed.");
        }

        Arrays.sort(files, String.CASE_INSENSITIVE_ORDER);
        return new ArrayList<>(Arrays.asList(files));
    }


}
