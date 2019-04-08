package com.lee

import java.util.*

fun main() {

    var sercet = Random().nextInt(10)+1
    println("$sercet")
    val scanner = Scanner(System.`in`)
    var isMatch =false;
    for(i in 1..4){
        print("Please input your number($i/4):")
        var number = scanner.nextInt()
        if (number>sercet){
            println("lower")
        }else if (number<sercet){
            println("higher")
        }else{
            println("Great number is $number")
            isMatch = true
            break
        }

    }
    if (!isMatch) println("not guess number , number is $sercet")



}