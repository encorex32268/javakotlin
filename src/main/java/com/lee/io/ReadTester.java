package com.lee.io;

import java.io.*;

public class ReadTester {

    public static void main(String[] args) {

//        bufferReader();
//        fileReader();
//        inputStream();
    }

    private static void bufferReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            int n = br.read();
            while (n != -1){
                System.out.println(n);
                n = br.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader() {
        try {
            FileReader fileReader = new FileReader("data.txt");
            int n = fileReader.read();
            while (n != -1){
                System.out.println(n);
                n = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        try {
            File file = new File("data.txt");
            InputStream in = new FileInputStream(file);
            if (file.exists()){
                int n = in.read();
                while (n != -1){
                    System.out.println(n);
                    n = in.read();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
