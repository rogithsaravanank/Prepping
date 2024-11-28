## Azentio 
```
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Azentio {
///Azentio
/// This program demonstrates filtering entries from a map based on specific keys (2 to 4) and prints the results. It utilizes Java Streams to process the data.
    public static void main(String[] args) {
//        add(4, 5);
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Orange");
        map.put(3,"Banana");
        map.put(4,"GUava");
        List<Map<Integer,String>> list = Arrays.asList(map);


        Map<Integer,String> result =new HashMap<>();

        list.stream().forEach(value ->{
            value.entrySet().stream().filter(entry -> entry.getKey() >=2 && entry.getKey()<=4).forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        });

        result.forEach((k,v)-> System.out.println(k +","+v));

    }




}

```