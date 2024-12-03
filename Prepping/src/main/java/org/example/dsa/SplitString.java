package org.example.dsa;
import java.util.*;

public class SplitString {
    public static String[] splitString(String s) {
        int n = s.length();
        Map<Character, Integer> lastOccurrence = new HashMap<>();

        // Step 1: Record the last occurrence of each character
        for (int i = 0; i < n; i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        // Step 2: Find the split point
        int currentMax = 0, splitPoint = 0;
        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, lastOccurrence.get(s.charAt(i)));

            if (i == currentMax) {
                splitPoint = i + 1;
                break;
            }
        }

        // Step 3: Split the string
        String firstPart = s.substring(0, splitPoint);
        String secondPart = s.substring(splitPoint);

        return new String[]{firstPart, secondPart};
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "abcabd";
        String[] result1 = splitString(s1);
        System.out.println("\"" + result1[0] + "\", \"" + result1[1] + "\""); // Expected: "abcab", "d"

        // Test case 2
        String s2 = "dxabxad";
        String[] result2 = splitString(s2);
        System.out.println("\"" + result2[0] + "\", \"" + result2[1] + "\""); // Expected: "dxabxad", ""
    }
}

