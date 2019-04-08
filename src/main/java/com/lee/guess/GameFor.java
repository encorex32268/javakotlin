package com.lee.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {

    public static void main(String[] args) {

        int secret = new Random().nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(secret);
        for (int i = 1 ; i <= 4 ; i++){
            System.out.println("Please input your number("+i+"/4) : ");
            int number = scanner.nextInt();
            System.out.println("猜第"+i+"次");
            if (number > secret){
                System.out.println("lower");
            }else if(number < secret){
                System.out.println("higher");
            }else{
                System.out.println("Great,number is "+number);
                break;
            }

            if (number == -1)
            {
                break;
            }


        }

    }
}
