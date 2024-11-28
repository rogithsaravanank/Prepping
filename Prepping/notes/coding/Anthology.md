## 1.

```
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Anthology {

    public static void main(String[] args) {
        //This program finds and prints the maximum value from a list of integers using Java Streams.
        // It utilizes the max method with a comparator to determine the largest number in the list.
        List<Integer> list = Arrays.asList(2,5,78,9,56,9,10);

        System.out.print(list.stream().max(Comparator.naturalOrder()).get());

    }
}

```

## 2.
public class Anthology1 {

//            ***1***
//            **121**
//            *12321*
//            1234321

    public static void main(String[] args) {
        //This program prints a specific pattern of numbers and asterisks to the console. 
        //It uses nested loops to control the number of asterisks and numbers printed in each line, creating a symmetrical pattern.
        int n=4;
        int starCount=n-1;
        for(int i=1;i<=4;i++)
        {

            for(int k=1;k<=starCount;k++) {
                System.out.print("*");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int k=1;k<=starCount;k++) {
                System.out.print("*");
            }
            starCount--;
            System.out.println();
        }
    }

}
