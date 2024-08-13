package org.example.dsa;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {5,4,7,2,1};
        int key=0,j=0;
        System.out.println("Insertion Sort ..");
        System.out.println("Before Sorting"+ Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key; 
            System.out.println("Each Sorting"+ Arrays.toString(arr));
        }
        System.out.println("After Sorting"+ Arrays.toString(arr));

    }
    
}
