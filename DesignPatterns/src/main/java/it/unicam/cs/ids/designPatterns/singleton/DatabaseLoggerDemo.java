package it.unicam.cs.ids.designPatterns.singleton;

import java.io.File;

public class DatabaseLoggerDemo {
    public static void main(String[] args) {
        File asd = new File("txt");
        DatabaseLogger dblogger = DatabaseLogger.getInstance(asd);
        System.out.println(dblogger.query("SELECT * FROM TABLE"));
        System.out.println(dblogger.write("DELETE * FROM TABLE"));

    }
}
