package com.lee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PersonTest {

    @Test
    public void bmiTester(){
        Person person = new Person("Lee",66.5f,1.7f);
        float bmi = 66.5f/(1.7f*1.7f);
        Assertions.assertEquals(bmi,person.bmi());

    }


}
