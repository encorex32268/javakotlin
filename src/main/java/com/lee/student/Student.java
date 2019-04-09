package com.lee.student;

public class Student {

    String id ;
    String name ;
    int english;
    int math ;

    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
        return (english>math)?english:math;
    }

    public void print(){
        System.out.println(name +"\t"+english +"\t"+math+"\t"+ getAverage() +"\t" +passOrFailed());
        System.out.println(garding());
    }

    public char garding() {
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

    public String passOrFailed() {
        if (getAverage()>=pass){
            return "PASS";
        }else {
            return "FAILED";
        }
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
