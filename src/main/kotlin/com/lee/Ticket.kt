package com.lee.kotlin

import kotlin.random.Random

data class Ticket(val start :Int , val end :Int , val price:Int)

fun main(args: Array<String>) {

    var ticket =Ticket(20,30,100)

    var string ="abcdefg"
    println(string.validateLength())
    var string2 ="ab"
    println(string2.validateLength())

    println((1..10).random())
}
fun String.validateLength() : Boolean{
    return this.length >=6
}
fun IntRange.random():Int{
    return Random.nextInt(endInclusive-start)+start
}
