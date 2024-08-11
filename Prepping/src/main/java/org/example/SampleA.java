package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleA {
    private int price;
    private String taste;

    // public String toString(){
    // return this.price +" "+ this.taste;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((taste == null) ? 0 : taste.hashCode());
        return result;
    }

    public static void main(String[] args) throws IOException {
        // SampleInterface objI= new SampleInterface() {

        // public void show(){
        // System.out.println("fsaa ");
        // }
        // };

        SampleInterface objI = (a,b) -> a+b;

       int res= objI.show(5,2);
       System.out.println(" It s the result "+res);
       System.out.println(" Enter a number ");
    //    int i=System.in.read(); Do not use give only the ascii Value
    Scanner sc= new Scanner(System.in);
    int i =sc.nextInt();
// int i=18;
       int j=0;
        try{
        j=18/i;
        if(j==0)
            throw new RogithException("Something is fine");}

        catch(RogithException e){
                System.out.println("printing the exception" + e);
            }


            System.out.println("After exception ");
            forEachTest();

    }

    @Override
    public String toString() {
        return "SampleA [price=" + price + ", taste=" + taste + "]";
    }

    public SampleA() {
    }

    public SampleA(int price, String taste) {
        this.price = price;
        this.taste = taste;
    }

    public void showA() {
        System.out.println("In sample A");
    }

    // public void show(){System.out.println("In sample A show");}
    // public void checkout(){System.out.println("In sample A checkout");}
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SampleA other = (SampleA) obj;
        if (price != other.price)
            return false;
        if (taste == null) {
            if (other.taste != null)
                return false;
        } else if (!taste.equals(other.taste))
            return false;
        return true;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void forEachTest(){
        List<Integer> lst=Arrays.asList(1,2,2,3);
AtomicInteger at=new AtomicInteger();
lst.forEach(a->at.addAndGet(a));

System.out.println(at);

int res=lst.stream().flatMapToInt(IntStream::of).sum();
System.out.println(res);

    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int add(int a,int b){
        return a+b;
    }

    // public boolean equals(SampleA obj){
    // if(this.taste.equals(obj.taste) && this.price==obj.price)
    // return true;
    // else
    // return false;
    // }

}
