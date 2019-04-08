package com.lee


fun main(args: Array<String>) {
//    println("hello kotlin");

    var number=19
    println(number)


    var mHuman = Human(66.5f,1.7f)

    println(mHuman.bmi())
}

class Human(var weight:Float , var height:Float ,var name :String=""){

    init {
        println("$name , $weight , $height")

        var c : Char = 'A'
        println(c.toInt() > 60)
    }
    fun hello(){
        println("hello im human")
    }
    fun bmi() : Float{
        var result = weight / (height*height)
        return  result

    }
}