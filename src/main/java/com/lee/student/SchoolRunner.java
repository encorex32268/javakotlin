package com.lee.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {

        System.out.print("Student's name :");
        System.out.print("Student's name :");
        System.out.print("Student's name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Student's english :");
        int english = scanner.nextInt();
        System.out.print("Student's math :");
        int math = scanner.nextInt();

        Student student = new Student(name,english,math);
        student.print();

    }
}
