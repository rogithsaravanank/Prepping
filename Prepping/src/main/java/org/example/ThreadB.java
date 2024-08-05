package org.example;

public class ThreadB implements Runnable{

    public void run(){
        int i=0;
        while(i<5){
            System.out.println("In thread B");i++;}
    }
    
}
