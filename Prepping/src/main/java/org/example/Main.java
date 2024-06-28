package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main extends Streams{
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Used reflections to create a constructor
//        Class<Streams> clazz = Streams.class;
//        Constructor<Streams> cons= clazz.getDeclaredConstructor();
//        cons.setAccessible(true);
//        Streams streams = cons.newInstance();

//        streams.methods();
        Main main1 = new Main();
        main1.methods();
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
//        Try is not allowed without catch or finally either one of them should be available
        try {
            System.out.println(s1 == s2);
        } finally {
            System.out.println("method is implemented");
        }

        System.out.println(Streams.testStatic);

    }

    @Override
    public void methods() {
        System.out.println("Main class Override method");
    }
}