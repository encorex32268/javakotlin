package com.lee;

public class Hello {

    public static void main(String[] args) {
//        System.out.println("hello world");

        Person person = new Person("Tom",66.5f,1.7f);
        System.out.println(person.bmi());

        int score = 88;

        char mChar = 'A';
        System.out.println(mChar>60);

    }
}
