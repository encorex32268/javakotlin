package com.lee;

public class Person {
    String name ;
    float weight;
    float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight,height);
        this.name = name;

    }

    public float bmi(){
        return weight / (height*height);
    }
}
