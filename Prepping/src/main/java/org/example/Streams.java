package org.example;

//Java 8 : features

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
// import java.util.ArrayList;
// import java.util.List;
import java.util.stream.*;

public class Streams {

    final int testFinal = 10;
    static int testStatic = 20;

    //    if the method is private then it is not accessible in the subclass
    public Streams() {
        System.out.println("Streams class constructor");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Streams class");
        Streams streams = new Streams();
        streams.methods();
    }
    public void methods() {
        System.out.println("Streams class method");
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("kiwi");
        fruit.add("kiwi");
        System.out.println("List of fruit-" + fruit);
        ArrayList<List<Integer>> flat = new ArrayList<>();
        flat.add(Arrays.asList(1, 2));
        flat.add(Arrays.asList(3, 4));
        flat.add(Arrays.asList(5, 6));
        // flat.add(fruit);
        System.out.println("List of flat-" + flat);
        // lets use map() to convert list of fruit
        List nlist = fruit.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println("List of nlist-" + nlist);

        List flist = flat.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("List of flat-" + flist);

        List f2list = fruit.stream()
                .peek(System.out::println)
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("List of f2list-" + f2list);

        fruit.forEach(s -> System.out.print(" sf \n" + s));

        // System.out.println("List of foreachlist-" + foreachlist);

        //reduce
        List<Integer> flatreduce = Arrays.asList(1, 2, 3, 4, 5);

        Integer rlist = flatreduce.stream().reduce(0, Integer::sum);

        System.out.println("\n List of flatreduce-" + rlist);

        Optional<Integer> maxi = flatreduce.stream().max(Comparator.naturalOrder());
        Optional<Integer> mini = flatreduce.stream().min(Comparator.naturalOrder());
        System.out.println("\n List of maxi-" + maxi + " mini " + mini);

        //skip

        Stream<Integer> skippedstream = flatreduce.stream().skip(3);
        skippedstream.forEach(System.out::println);

        //distinct limit

        List dlist = fruit.stream()
                .distinct()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("List of dlist-" + dlist);


        //.parallel() — Concurrent execution


    }
    public static void ques(){
        String s = "120.sid.0.1";
        
        String[] arr = s.split("\\.");  // Escape the dot
        
        if (arr.length == 4) {
            String verifiedString = Arrays.stream(arr)
                .filter(x -> {
                    try {
                        Integer.parseInt(x);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .filter(x -> {
                    int num = Integer.parseInt(x);
                    return num > 0 && num <= 255;
                })
                .collect(Collectors.joining("."));
            
            System.out.println(verifiedString);
        } else {
            System.out.println("Invalid input string.");
        }
}
}