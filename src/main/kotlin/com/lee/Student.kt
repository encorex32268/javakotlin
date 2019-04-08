package com.lee

import java.util.*


fun main(args: Array<String>) {

//    userInput()
    val stu = Student("Lee", 90, 99)
    stu.print()

    println("student highest is ${stu.highest()}")
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Student's name ")
    var name = null

    print("Student's english")
    var english = scanner.nextInt()
    print("Student's math")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

class Student(var name :String? , var english:Int,var math :Int){
    fun print(){
        println("$name \t $english \t $math  \t ${getAverage()} \t ${passOrFailed()} \t ${garding()}" )
    }

    fun garding()=when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 ->'B'
        in 70..79 ->'C'
        in 60..69 ->'D'
        else -> 'F'
    }
    fun passOrFailed()=if (getAverage()>=60)"PASS" else "FAILED"
    fun getAverage() = (english + math) / 2
    fun nameCheck()=name?.length
    fun highest() =if (english > math) english else math

}