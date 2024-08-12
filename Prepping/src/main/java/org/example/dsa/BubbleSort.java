package org.example.dsa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr= {1,9,3,3,4,4,5};
    int temp=0;
    
    System.out.println("Before Sorting"+Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    System.out.println("After Sorting"+Arrays.toString(arr));
   
    }


}
