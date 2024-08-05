package org.example;

public class ThreadA implements Runnable{
    
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("In thread A");i++;}
    }
}
