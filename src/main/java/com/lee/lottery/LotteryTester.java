package com.lee.lottery;

public class LotteryTester {

    public static void main(String[] args) {

        NumberGame bigGame = new BigGame();
        NumberGame game539 = new Game539();
        bigGame.generate();
        game539.generate();


        bigGame.print();
        game539.print();

    }
}
