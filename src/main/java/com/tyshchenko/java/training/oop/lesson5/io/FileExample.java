package com.tyshchenko.java.training.oop.lesson5.io;

import java.io.File;

/**
 * @author Alexander Tyshchenko.
 */
public class FileExample {

    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        //
        File file = new File("/work/work/SonarQubeAsCi.pdf");

        print("File Name: " + file.getName());
        print("Path: " + file.getPath());
        print("Abs Path: " + file.getAbsolutePath());
        print("Parent: " + file.getParent());
        print(file.exists() ? "exists" : "does not exist");
        print(file.canWrite() ? "is writeable" : "is not writeable");
        print(file.canRead() ? "is readable" : "is not readable");
        print("is " + (file.isDirectory() ? "" : "not" + " a directory"));
        print(file.isFile() ? "is normal file" : "might be a named pipe");
        print(file.isAbsolute() ? "is absolute" : "is not absolute");
        print("File last modified: " + file.lastModified());
        print("File size: " + file.length() + " Bytes");
    }

}
