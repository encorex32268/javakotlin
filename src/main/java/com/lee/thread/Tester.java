package com.lee.thread;

public class Tester {

    public static void main(String[] args) {

        System.out.println("main start");
        for (int i = 0; i < 10; i++) {
            System.out.println("main :"+i);
        }
        System.out.println("main end");

        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread :"+i);
                }
            }
        };
        thread.start();
        Thread mThread = new MyThread();
        mThread.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread :"+i);
        }
    }
}
