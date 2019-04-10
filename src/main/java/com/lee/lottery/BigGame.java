package com.lee.lottery;

import java.util.Random;

public class BigGame extends NumberGame {
    int numberCount  = 7;

    @Override
    public void generate() {
        Random random  = new Random();
        while (hashSet.size()!=numberCount){
            hashSet.add(random.nextInt(49)+1);
        }

    }

}
