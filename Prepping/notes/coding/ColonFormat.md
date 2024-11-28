#### Colon format
```
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ColonFormat {
    //This program counts the occurrences of each integer in an array (including nulls) and prints the results in a specific format.
    // It uses Java Streams to group and count the values.
    //Need input
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 3, 4, 5, 2, 2, 2, 3, 4, 5, 32, 8, null};
        //Arrays.stream(arr).filter(Objects::nonNull).collect(Collectors.groupingBy(value -> value, Collectors.counting())).forEach((key, value) -> System.out.println(key + " : " + value));
        Map<Integer,Long> map = Arrays.stream(arr).filter(Objects::nonNull).collect(Collectors.groupingBy(value -> value, Collectors.counting()));
        System.out.print("[");
        map.forEach((key,value) ->{
            System.out.print(key +":"+value +",");
        } );
        System.out.print("]");

    }
}

```