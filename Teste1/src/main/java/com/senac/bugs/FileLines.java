package com.senac.bugs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileLines {

    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        int lines = 0;
        for (String line : Files.readAllLines(file.toPath())) {
            lines++;
        }
        System.out.println("O arquivo tem " + lines + " linhas.");
    }

}
