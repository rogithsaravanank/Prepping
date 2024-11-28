#### Merge Sorted Arrays

```
import java.util.Arrays;

public class MergeTwoSortedArrayList {
    //This program merges two sorted integer arrays into a single sorted array. 
    //It uses a while loop to compare elements from both arrays and fills a result array accordingly. The final merged array is printed.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 6, 7, 8, 9};
        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }
        System.out.println(Arrays.toString(result));
    }
}

class findMedian
{
    public static void main(String[] args) {

    }
}

```