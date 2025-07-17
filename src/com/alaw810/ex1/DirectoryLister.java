package com.alaw810.ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectoryLister {
    private String path;

    public DirectoryLister(String path) {
        this.path = path;
    }

    public ArrayList<String> listDirectory() throws IOException {
        File directory = new File(this.path);

        if (!directory.isDirectory()) {
            throw new IOException("The path provided is not a directory.");
        }

        String[] rawList = directory.list();
        if (rawList == null) {
            throw new IOException("The directory could not be accessed.");
        }

        ArrayList<String> files = new ArrayList<>(List.of(rawList));
        Collections.sort(files);
        return files;
    }


}
