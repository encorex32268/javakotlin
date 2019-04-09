package com.lee.student;

public class GraduateStudent extends Student {

    int thesis ;
    static int pass =70;

    public GraduateStudent(String name, int english, int math,int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        System.out.println(name +"\t"+english +"\t"+math+"\t"+thesis+"\t"+

                + getAverage() +"\t" +passOrFailed() +"\t"+garding());

    }

    @Override
    public String passOrFailed() {
        if (getAverage()>=pass){
            return "PASS";
        }else {
            return "FAILED";
        }
    }

    @Override
    public int getAverage() {
        return (english+math+thesis)/3;
    }
}
