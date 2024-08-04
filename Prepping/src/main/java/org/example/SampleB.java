package org.example;

public class SampleB extends SampleA implements SampleInterface {
    
public static void main(String[] args) {
    

    SampleA objA= new SampleA();
    
    objA.setPrice(10); 
    objA.setTaste("good");
    System.out.println(objA.toString());// This will give the hascode if there is no to String in the A class

    SampleA objA2= new SampleA();
    objA.setPrice(10); 
    objA.setTaste("good");

    System.out.println(objA.equals(objA2));// This will give false until the equals method is overriden
SampleB objB=new SampleB();

    objB.show();
    objB.checkout();
}
public void show(){
    System.out.println("Show via interface");
}
public void checkout(){
    System.out.println("checkout via interface");
}

public void showB(){
    System.out.println("In sample B");
}

}
