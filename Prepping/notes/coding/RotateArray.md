### Rotate array

```
 public static void main(String[] args) {
        int[] input ={1,2,3,4,5,6,7,8};

        int order =6;

        order = order % input.length;

        int k= input.length-order;
        reverseArray(input,0,k-1);
        reverseArray(input,k, input.length-1);
        reverseArray(input,0, input.length-1);

        System.out.println(Arrays.toString(input));
    }
    public static  void  reverseArray(int[] input, int start, int end){
        while (start< end){
            int temp = input[start];
            input[start]=input[end];
            input[end]=temp;
            start++;
            end--;
        }
    }

}
```