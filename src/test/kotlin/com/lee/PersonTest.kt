package com.lee.kotlin

import com.lee.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class PersonTest{
    val student= Student("jack",77,50);


    @Test
    fun bmiTest(){
        Assertions.assertEquals(77,student.highest())
    }

    @Test
    fun getAverageTest(){
        Assertions.assertEquals((77+50)/2,student.getAverage())
    }

    @Test
    fun passOrFailedTest(){
        Assertions.assertEquals("PASS",student.passOrFailed())
    }

    @Test
    fun gardingTest(){
        Assertions.assertEquals('D',student.garding())
    }
}