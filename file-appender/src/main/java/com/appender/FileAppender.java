package com.appender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileAppender {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Please provide file name and line content to be added");
        }
        String fileName = args[0];
        String lineContent = args[1] + System.getProperty("line.separator");

        Path file = Paths.get(fileName);
        if (!Files.exists(file)) {
            Files.createFile(file);
        }
        Files.write(file, lineContent.getBytes(), StandardOpenOption.APPEND);
    }
}
