package org.example.junit;

import java.util.Arrays;

public class Calc {
    
    public int add(int a , int b){return a+b;}

    public int square(int a){return a*a;}

    public int[] sortCalc(int[] arr){Arrays.sort(arr);return arr;}

    public int[] sortCalcTimeout(int[] arr){for(int i=0;i<100000;i++){Arrays.sort(arr);}return arr;}
}


