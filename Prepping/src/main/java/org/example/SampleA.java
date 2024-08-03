package org.example;

 public class SampleA {
    int price;
    String taste;

    public String toString(){
        return this.price +" "+ this.taste;
    }

    public boolean equals(SampleA obj){
     if(this.taste.equals(obj.taste) && this.price==obj.price)
        return true;
    else 
        return false;    
    }
}

