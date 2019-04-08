package com.lee

import java.util.*


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("Student's name ")
    var name =null

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
        println("$name \t $english \t $math  \t"+(english+math)/2)
    }
    fun nameCheck(){
        print(name?.length)
    }
}