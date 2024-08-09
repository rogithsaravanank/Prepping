package org.example.dsa;
import java.util.*;

public class BasicsDSA {
    public static void main(String[] args) {   
        System.out.println("Hello..");     
        int[] arr={1,2,3,4,5,6};
        
        System.out.println(findingMid(arr,12));

        int start=0;
    int end=arr.length-1;
    System.out.println(findingMidRecursive(arr,1,start,end));
    }
public static int findingMid(int[] arr,int target){
    int start=0;
    int end=arr.length-1;

    while(start<=end){
    int mid= (start+end)/2;
    if(arr[mid]==target)
        {return mid;}
    else if(arr[mid]>target)
        {end=mid-1;}
    else if(arr[mid]<target)
        {start=mid+1;}
    }
    return -1;
}

public static int findingMidRecursive(int[] arr,int target,int start,int end){
    
    while(start<=end){
    int mid= (start+end)/2;
    if(arr[mid]==target)
        {return mid;}
    else if(arr[mid]>target)
        {return findingMidRecursive(arr,target,start,mid-1);}
    else if(arr[mid]<target)
        { return findingMidRecursive(arr,target,mid+1,end);}
    }
    return -1;
}

}

