package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SampleB extends SampleA implements Comparable{


    public static void main(String[] args) {

        SampleA objA = new SampleA();

        objA.setPrice(10);
        objA.setTaste("good");
        System.out.println(objA.toString());// This will give the hascode if there is no to String in the A class

        SampleA objA2 = new SampleA();
        objA.setPrice(10);
        objA.setTaste("good");

        System.out.println(objA.equals(objA2));// This will give false until the equals method is overriden
        // SampleB objB=new SampleB();

        // new SampleB().show();
        // new SampleB().checkout();

        comparatorTest();
        comparatorTestString();
        streamTest();
    }
    // public void show(){
    // System.out.println("Show via interface");
    // }
    // public void checkout(){
    // System.out.println("checkout via interface");
    // }

    public void showB() {
        System.out.println("In sample B");
    }

    public static void comparatorTest(){
        // Comparator<Integer> cmp= (i,j)-> (i%10>j%10)?1:-1;
           
        List<Integer> lst =new ArrayList<>();
        lst.add(31);
        lst.add(45);
        lst.add(36);
        lst.add(94);
        lst.add(37);

        Collections.sort(lst,(i,j)-> (i%10>j%10)?1:-1);

        System.out.println(lst);
    }

    public static void comparatorTestString(){
        Comparator cmp= new Comparator<String>() {
            public int compare(String i,String j){
                // if(i.length()>j.length())
                //     return 1;
                // else 
                //     return -1;

                return (i.length()>j.length()) ? 1:-1;
            }
        };
        List<String> lst =new ArrayList<>();
        lst.add("sdfafasfa");
        lst.add("fdafadfgadfad");
        lst.add("af");
        lst.add("afdafasfasfafsafa");
        lst.add("r");

Collections.sort(lst,cmp);

System.out.println(lst);


    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public static void streamTest(){
        List<Integer> lst= Arrays.asList(2,23,4,1,4);

        int res= lst.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(c,e)->c+e);

        Stream<Integer> s1= lst.stream();
        Stream<Integer> s2=s1.filter(i->i%2==0);
        Stream<Integer> s3= s2.map(i->i*2);
        int result= s3.reduce(0,(c,e)->c+e);
        
        System.out.println(res);
        System.out.println(result);

 // filter        
// Predicate<Integer> pr= new Predicate<Integer>() {
//     public boolean test(Integer a){
//        if(a%2==0)
//         return true;
//     }
// };

// map

// Function<Integer,Integer> fun= new Function<Integer,Integer>() {
//     public Integer apply(Integer a){return a*2;} 
// };


    
    }

}
