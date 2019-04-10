package com.lee.lottery;

import java.util.Random;

public class Game539 extends NumberGame {
    int numberCount = 5 ;

    @Override
    public void generate() {
        Random random = new Random();
        while (hashSet.size() != numberCount){
            hashSet.add(random.nextInt(39)+1);
        }
    }


}
