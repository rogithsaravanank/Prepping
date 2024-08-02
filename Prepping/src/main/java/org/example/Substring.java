package org.example;
import java.util.*;

public class Substring {
    
    String s="abcabd";
    // “abcab”, “d”
     
    // “dxabxad” = “dxabxad”


    // char[] arr= s.toCharArray();
    String[] arrOfStr = s.split(":");
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
         
    String s="abcabd";
    String e=s;
        String[] arrOfStr = s.split("");
       int temp=1;
       String result="";
        String result_2="";
        System.out.println(s);
    System.out.println(Arrays.toString(arrOfStr));
    for (String a:arrOfStr){

     s=s.substring(temp,s.length());
            System.out.println(s);
     if(s.contains(a)){
         result+=a;
     }
    //  else{
    //      result_2+=a;
    //  }
        
    }
    
    String[] arrOfStr1= e.split(result,2);

System.out.println(result+" result_2 "+Arrays.toString(arrOfStr1));    
    }
}


