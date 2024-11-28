#### - 1.Write Logic for ATM machine  

// Input: Enter the amt: 2630 

// Output:  
// 1000 - 2 
// 500 - 1 
// 100 - 1 
// 20 - 1 
// 10 - 1 
// Assume there are infinite number of notes in atm machine

``` import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 1};
        int[] notesCount = new int[denominations.length];
        
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
        
        System.out.println("Output:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] != 0) {
                System.out.println(denominations[i] + " - " + notesCount[i]);
            }
        }
        
        scanner.close();
    }
}
```


#### 2.String s = “TestABCDE”

Find max repeating character and min repeating character (both case insensitive). If there are same number of repeating characters:
For max -> pick the first character alphabetically
For min -> pick the last character alphabetically

For this given input T is repeating 2 times, so max is T
e, s, A, B, C, D, E are all repeating 1 time, so take s as it is the last in alphabetical order

And then invert max and min

``` 
import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        String s = "TestABCDE";
        System.out.println(invertMaxMinCharacters(s));
    }

    public static String invertMaxMinCharacters(String s) {
        // Convert string to lowercase to handle case insensitivity
        String lowerCaseStr = s.toLowerCase();
        
        // Use a TreeMap to maintain alphabetical order
        TreeMap<Character, Integer> frequencyMap = new TreeMap<>();
        
        // Count frequency of each character
        for (char ch : lowerCaseStr.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Find the max and min frequency characters
        char maxChar = '\0';
        char minChar = '\0';
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            
            // For max frequency character
            if (freq > maxFreq || (freq == maxFreq && ch < maxChar)) {
                maxFreq = freq;
                maxChar = ch;
            }
            
            // For min frequency character
            if (freq < minFreq || (freq == minFreq && ch > minChar)) {
                minFreq = freq;
                minChar = ch;
            }
        }
        
        // Invert the positions of maxChar and minChar in the original string
        char[] resultArray = s.toCharArray();
        char maxCharOriginal = Character.toUpperCase(maxChar);
        char minCharOriginal = Character.toUpperCase(minChar);
        
        for (int i = 0; i < resultArray.length; i++) {
            if (Character.toLowerCase(resultArray[i]) == maxChar) {
                resultArray[i] = Character.isUpperCase(resultArray[i]) ? minCharOriginal : minChar;
            } else if (Character.toLowerCase(resultArray[i]) == minChar) {
                resultArray[i] = Character.isUpperCase(resultArray[i]) ? maxCharOriginal : maxChar;
            }
        }
        
        return new String(resultArray);
    }
}
```