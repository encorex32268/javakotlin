package com.lee.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {

//        userInput();
        Student.pass = 40;

        Student student = new Student("Lee",30,90);
        student.print();
        Student student2 = new Student("Tom",40,50);
        student2.print();
        Student student3 = new Student("Jim",20,100);
        student3.print();

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
