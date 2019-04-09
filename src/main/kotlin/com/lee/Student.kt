package com.lee

import java.util.*


fun main(args: Array<String>) {

//    userInput()
    Student.pass =30
    Student.test()
    val stu = Student("Lee", 60, 60)
    stu.print()
    val stu2 = Student("Tom", 30, 40)
    stu2.print()
    val stu3 = Student("Jim", 10, 50)
    stu3.print()

    val gstu3 = GraduateStudent("Jack", 100, 70,60)
    gstu3.print()

    println("student highest is ${stu.highest()}")
}

class GraduateStudent(name: String?,english: Int,math: Int,thesis:Int) : Student(name, english, math){
    companion object {
         var pass = 90
    }

    override fun print() {
        println("$name \t $english \t $math  \t ${getAverage()} \t ${passOrFailed()} \t ${garding()}" )

    }

    override fun passOrFailed()=if (getAverage()>= pass)"PASS" else "FAILED"

}



open class Student(var name :String? , var english:Int,var math :Int){

    //static
    companion object {
        //java file use
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }
     open fun print(){
        println("$name \t $english \t $math  \t ${getAverage()} \t ${passOrFailed()} \t ${garding()}" )
    }

    fun garding()=when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 ->'B'
        in 70..79 ->'C'
        in 60..69 ->'D'
        else -> 'F'
    }
    open fun passOrFailed()=if (getAverage()>=pass)"PASS" else "FAILED"
    fun getAverage() = (english + math) / 2
    fun nameCheck()=name?.length
    fun highest() =if (english > math) english else math

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