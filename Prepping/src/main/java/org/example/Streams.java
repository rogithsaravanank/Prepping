package org.example;

//Java 8 : features

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.util.function.Function;
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
        // streams.methods();
        streams.practice();
    }
    public static void practice(){
        System.out.println("Practice method");
        int[] numbers1 = {6,1, 2, 3, 4, 5};
        Integer[] numbers = {6,1, 2, 3, 4, 5};
        ArrayList<List<Integer>> flat = new ArrayList<>();
        flat.add(Arrays.asList(1, 2));
        flat.add(Arrays.asList(3, 8));
        flat.add(Arrays.asList(2, 6));
        // Sum of squares of all even numbers in Java:
       int a= Arrays.stream(numbers)
        .filter(x -> x % 2 == 0)
        .map(x -> x * x)
        .reduce(0,Integer::sum);
        System.out.println(a);

        System.out.println(Arrays.stream(numbers1).sum());

       List<Integer> res= Arrays.stream(numbers).sorted().collect(Collectors.toList());
       System.out.println(res);
       List<Integer> lst=flat.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        // flat.stream().flatMap().reduce(0,Integer::sum);
        System.out.println(lst);

        List<Integer> lstsort=lst.stream().sorted().skip(2).collect(Collectors.toList());
        System.out.println(lstsort);
        List<Integer> lstsort2=lst.stream().sorted((a1,b)->b-a1).collect(Collectors.toList());
System.out.println(lstsort2);

//Find the second max of student age in Java:
    Optional<Integer> e=lst.stream().max(Integer::compareTo);
    Optional<Integer> r=lst.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    System.out.println(r);
   System.out.println( Arrays.stream(numbers).filter(i->i%2==0).map(i->i*i).reduce(0,Integer::sum));


   //Find list of unique characters present in all strings in Java:

List<String> strings = Arrays.asList("abc", "bcd", "cde");

Set<Character> set=strings.stream().flatMap(str->str.chars().mapToObj(ch->(char)ch)).collect(Collectors.toSet());


System.out.println(set);

//5. **Convert a list into a map in Java:**
List<String> list = Arrays.asList("1", "2", "3", "4");

Map<String,String> map=list.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));

System.out.println(map);

//Sort and reverse order in Java:

System.out.println(lst);

lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
List<Integer> topTwo=Arrays.stream(numbers1)
    .boxed()
    .sorted(Comparator.reverseOrder())
    .limit(2)
    .collect(Collectors.toList());

    System.out.println(topTwo);
//Get count of each character in Java:

List<String> stringsa = Arrays.asList("abc", "bcd", "cde");

Map<Character,Long> map2=stringsa.stream()
.flatMap(str->str.chars()
.mapToObj(ch->(char)ch))
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

System.out.println(map2);    

//Join given list values with a comma in Java

// stringsa.stream().collect(Collectors.joining(","));
System.out.println(stringsa.stream().collect(Collectors.joining(",")));


//Find missing numbers between 1 to 1000

int[] inputArray = {1, 2, 4, 5, 7, 8, 10, 999, 1000};

Set<Integer> arraySet=Arrays.stream(inputArray).boxed().collect(Collectors.toSet());

List<Integer> missList=IntStream.rangeClosed(1, 1000).filter(num->!arraySet.contains(num)).boxed().collect(Collectors.toList());

// System.out.println(missList);



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