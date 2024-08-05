package org.example;

public class ThreadSample {


    public static void main(String[] args) {
        
        Runnable objA=() -> {
                int i=0;
                while(i<5){
                    System.out.println("In thread A");i++;}
            
        };
        Runnable objB=()->{
            int i=0;
            while(i<5){
                System.out.println("In thread B");i++;}
        };
        
        Thread t1= new Thread(objA);
        Thread t2= new Thread(objB);

        t1.start();
        t2.start();

    }
    
}
