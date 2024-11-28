## Digit Occurence
```
import java.util.HashMap;
import java.util.Map;

public class DigitOccurence {
    //This program counts the occurrences of each digit in a given integer (1231). It uses a HashMap to store the digit counts and prints the result.
    public static void main(String[] args) {
        int digit =1231;
        String str = String.valueOf(digit);
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(!map.isEmpty() && map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else{
                map.put(c,1);
            }
        }

        map.forEach((k,v)-> System.out.println(k +" -> " +v));
    }
}

```