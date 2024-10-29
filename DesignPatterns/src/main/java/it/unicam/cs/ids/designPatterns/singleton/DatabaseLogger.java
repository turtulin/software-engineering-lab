package it.unicam.cs.ids.designPatterns.singleton;

import java.io.File;

public class DatabaseLogger {
    private static DatabaseLogger instance;
    private File file;

    private DatabaseLogger(File file) {
        this.file = file;
    }

    public static DatabaseLogger getInstance(File file) {
        if (instance == null) {
            instance = new DatabaseLogger(file);
        }
        return instance;
    }

    public String query(String command) {
        return "executing " + command;
    }

    public boolean write(String command) {
        // non so cosa scrivere qui dentro xD
        return false;
    }
}
