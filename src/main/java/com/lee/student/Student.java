package com.lee.student;

public class Student {

    String id ;
    String name ;
    int english;
    int math ;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
        return (english>math)?english:math;
    }

    public void print(){
        System.out.println(name +"\t"+english +"\t"+math+"\t"+ getAverage());
        passOrFailed();
        System.out.println(garding());
    }

    private char garding() {
        char result ;
        switch (getAverage()/10){
            case 10:
            case 9:
                result = 'A';
                break;
            case 8:
                result = 'B';
                break;
            case 7:
                result = 'C';
                break;
            case 6:
                result = 'D';
                break;
                default:
                    result = 'F';
                    break;
        }
        return result;
    }

    private void passOrFailed() {
        if (getAverage()>=60){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }
    }

    private int getAverage() {
        return (english+math)/2;
    }
}
