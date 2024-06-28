package org.example;

//import java.util.*;

public class Keywords {
    final int testFinal = 10;
    static int testStatic = 20;
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Keywords class");
        Keywords keywords = new Keywords();
        keywords.methods();
    }

    public void methods() {
        System.out.println("Keywords class method");

        //        cannot assign a value to final variable testFinal
        //        testFinal = 20;
        Streams.testStatic = 30;
        System.out.println("testStatic " + Streams.testStatic);

        //enum
        Day day = Day.MONDAY;
        switch (day){
            case FRIDAY:
                System.out.println("It's Friday");
                break;
            default:
                System.out.println("It's not Friday");
        }
        int age = 17;
    assert age >=18:"age is not 18";

        System.out.println("age assert " + age);
    }

}
