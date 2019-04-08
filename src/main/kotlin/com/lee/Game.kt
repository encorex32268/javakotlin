package com.lee

import java.util.*

fun main() {

    var secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    var number =0
    println("Please input your number :")
    while (number != secret){
        number = scanner.nextInt()

//        when(secret>0){
//            number>secret -> println("lower")
//            number < secret -> println("higher")
//            else -> println("Great number is $number")
//        }
        if (number>secret){
            println("lower")
        }else if(number < secret){
            println("higher")
        }else{
            println("Great number is $number")
        }
    }


}