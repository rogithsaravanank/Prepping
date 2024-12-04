package org.example;

import java.util.*;
import java.util.stream.*;
import java.util.Map;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
       return "Name "+name+" Age "+age;
    }


}

