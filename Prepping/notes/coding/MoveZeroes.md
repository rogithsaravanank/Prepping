#### 1.
```
import java.util.Arrays;

public class MoveZerosToEnd {
    //This program moves all zeros in an integer array to the end while maintaining the order of non-zero elements.
    // It iterates through the array and fills the remaining positions with zeros.
    public static void main(String[] args) {
        int[] arr ={1,0,3,0,5,0,0};
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while(count< arr.length){
           arr[count++]=0;
        }
       System.out.print(Arrays.toString(arr));
    }
}

```
#### 2.
```
import java.util.Arrays;

public class MoveZerosToFront {
//    public static void main(String[] args) {
//        int[] arr = {1, 0, 3, 0, 5, 0, 0};
//        Arrays.sort(arr);
//        System.out.print(Arrays.toString(Arrays.stream(arr).toArray()));
//        //Need to learn all the sorting algorithm
//    }
public static void main(String[] args) {
    int[] arr ={1,0,3,0,5,0,0};
    int count= arr.length-1;
    for (int i= arr.length-1;i>=0;i--)
    {
        if(arr[i]!=0)
        {
            arr[count--]=arr[i];
        }
    }
    while(count>=0){
        arr[count--]=0;
    }
    System.out.print(Arrays.toString(Arrays.stream(arr).toArray()));
}
}

```
