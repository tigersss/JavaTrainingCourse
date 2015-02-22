package com.tyshchenko.java.training.oop.lesson5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Tyshchenko.
 */
public class FileSearcher {

    private static List<String> findFiles(String srcPath, String ext) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));

        List<String> listFiles = new ArrayList<>(files.length);

        for (int i = 0; i < files.length; i++) {
            listFiles.add(srcPath + files[i].getName());
        }

        return listFiles;
    }

    public static void main(String[] args) {

        try {
            List<String> files = findFiles("/work/Documentation", ".pdf");
            for (String file : files) {
                System.out.println(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}