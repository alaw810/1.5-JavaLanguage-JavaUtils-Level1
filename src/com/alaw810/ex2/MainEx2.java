package com.alaw810.ex2;

import java.io.File;

public class MainEx2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        String path = args[0];
        File directory = new File(path);

        DirectoryTreeLister.listDirectoryRecursively(directory, 0);
    }
}
