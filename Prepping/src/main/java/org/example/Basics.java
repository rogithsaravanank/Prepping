package org.example;

import java.util.Arrays;

public class Basics {

    static int num1 = 0x7E;
    static int num2 = 0b101;

    public static void main(String[] args) {
        System.out.println("Hello...");
        Basics obj = new Basics();
        obj.getNum();
        obj.multiDimension();
        obj.jaggedArray();
        obj.stringBuffer();
    }

    private void getNum() {
        System.out.println(num1 + " " + num2);

        num2 = (num1 > num2) ? num1 : num2;

        System.out.println(num1 + " " + num2);

        int[] array = { 1, 2, 3 };
        int[] num = new int[3];
        System.out.println("Array " + Arrays.toString(array));
    }

    private void multiDimension() {
        int multi_arrray[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                multi_arrray[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multi_arrray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void jaggedArray(){
        int[][] nums= new int[3][];
        nums[0]=new int[2];
        nums[1]=new int[1];
        nums[2]=new int[3];
        System.out.println("Jagged Array" + nums.length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for(int a[]:nums){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }

    public void stringBuffer(){

        StringBuffer str=new StringBuffer();

        System.out.println("Size of empty String buffer "+str.capacity());
    }

}
