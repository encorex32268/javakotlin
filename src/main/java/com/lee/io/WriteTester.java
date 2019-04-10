package com.lee.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {

    public static void main(String[] args) {

//        writer();
    }

    private static void writer() {
        try {
            FileWriter fileWriter = new FileWriter("/Users/lee/Desktop/output.txt");
            fileWriter.write("abc123");
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
