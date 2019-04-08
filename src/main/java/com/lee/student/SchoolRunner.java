package com.lee.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {

//        userInput();

        String name = "lee";
        int english = 80;
        int math = 90;
        Student student = new Student(name,english,math);
        student.print();
        System.out.println("high score: "+student.highest());

    }

    private static void userInput() {
        System.out.print("Student's name :");
        System.out.print("Student's name :");
        System.out.print("Student's name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Student's english :");
        int english = scanner.nextInt();
        System.out.print("Student's math :");
        int math = scanner.nextInt();
    }
}
