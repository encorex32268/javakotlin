package com.lee.lottery;


import java.util.HashSet;

public abstract class NumberGame {
    int numberCount = 6;
    HashSet<Integer> hashSet =new HashSet<>();

    public abstract void generate();

    public boolean validate(){
        if (hashSet.size() == numberCount){
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(hashSet);
    }

}
