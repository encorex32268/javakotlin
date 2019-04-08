package com.lee.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(""+secret);
        int number = 0;
        while (number != secret){
            System.out.println("Please input a number :");
            number = scanner.nextInt();
            if (number <secret){
                System.out.println("higher");
            }else if (number>secret){
                System.out.println("lower");
            }else{
                System.out.println("Great, number is "+secret);
            }

        }

    }
}
