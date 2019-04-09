package com.lee;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.lee.student.Student;
public class StudentTest {

    @Test
    public void highestTest(){
        Student student = new Student("Lee",66,70);
        Assertions.assertEquals(70,student.highest());
    }
    @Test
    public void gardingTest(){
        Student student = new Student("Lee",70,70);
        Assertions.assertEquals('C',student.garding());
    }
    @Test
    public void getAverageTest(){
        Student student = new Student("Lee",70,80);
        Assertions.assertEquals((70+80)/2,student.getAverage());

    }
    @Test
    public void passOrFailedTest(){
        Student student = new Student("Lee",70,60);
        Assertions.assertEquals("PASS",student.passOrFailed());
    }
}
