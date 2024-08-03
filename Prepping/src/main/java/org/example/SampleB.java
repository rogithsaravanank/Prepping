package org.example;

public class SampleB {
    
public static void main(String[] args) {
    

    SampleA objA= new SampleA();
    
    objA.price =10; 
    objA.taste="good";
    System.out.println(objA.toString());// This will give the hascode if there is no to String in the A class

    SampleA objA2= new SampleA();
    objA2.price =10; 
    objA2.taste="good";

    System.out.println(objA.equals(objA2));// This will give false until the equals method is overriden

}

}
