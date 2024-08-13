package org.example.dsa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    int[] arr= {5,4,7,2,1};
    
    System.out.println("Insertion Sort ..");
    System.out.println("Before Sorting"+ Arrays.toString(arr));
    int low=0,high=arr.length-1;

    quickSorting(arr,low,high);

    System.out.println("After Sorting"+ Arrays.toString(arr));
    }

    private static void quickSorting(int[] arr, int low, int high) {
        if(low<high){
        int pivt=partion(arr,low,high);
        quickSorting(arr,low,pivt-1);
        quickSorting(arr, pivt+1, high);
        }

    }

    private static int partion(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void swap(int[] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
