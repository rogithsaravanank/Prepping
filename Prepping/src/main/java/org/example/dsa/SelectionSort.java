package org.example.dsa;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection Sort ...");
            int[] arr= {1,9,3,3,4,4,5};
    int tempmax=0,maxIndex=-1;
    int tempmin=0,minIndex=-1;
    
    
    System.out.println("Before Sorting"+Arrays.toString(arr));
        //MaxIndex
        for(int i=0;i<arr.length-1;i++){maxIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxIndex]){maxIndex=j;}//Only if j has higher value than the maxIndex it will be set
            }
                tempmax=arr[i];//we can automatically swap the values because already the inner loop will check the possiblities totally
                arr[i]=arr[maxIndex];
                arr[maxIndex]=tempmax;
            
            // System.out.println("Each Sorting"+Arrays.toString(arr));
        }
        System.out.println("After maxIndex Sorting"+Arrays.toString(arr));
        //MinIndex
        for(int i=0;i<arr.length-1;i++){minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){minIndex=j;}
            }
                tempmin=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=tempmin;
            
            // System.out.println("Each Sorting"+Arrays.toString(arr));
        }
    System.out.println("After minIndex Sorting"+Arrays.toString(arr));

    }
}
