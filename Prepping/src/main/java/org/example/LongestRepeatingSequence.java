package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class LongestRepeatingSequence {

    // Method to find the longest repeating sequence
    public static String findLongestRepeatingSequence(String str) {
        int n = str.length();
        String longestSeq = "";

        // Iterate through all substrings
        for (int len = 1; len <= n; len++) { // Length of the substring
            HashSet<String> seenSubstrings = new HashSet<>();
            for (int i = 0; i <= n - len; i++) { // Starting index of the substring
                String substring = str.substring(i, i + len);
                
                // Check if the substring is already seen
                if (seenSubstrings.contains(substring)) {
                    if (substring.length() > longestSeq.length()) {
                        longestSeq = substring;
                    }
                } else {
                    seenSubstrings.add(substring);
                }
            }
        }

        return longestSeq;
    }


    public static int longestRepeatingSubsequences(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        Arrays.stream(dp)
        .forEach(row -> Arrays.stream(row)
                .forEach(value -> System.out.print(str.charAt(value) + " ")));

                Arrays.stream(dp)
    .map(row -> IntStream.of(row).mapToObj(String::valueOf).toArray(String[]::new))
    .forEach(row -> System.out.println(Arrays.toString(row)));
        return dp[n][n];

    }

    public static int lengthOfLongestSubstring(String str) {
        int ans=0;
        int i=0,j=0;
        HashSet<Character> set=new HashSet<>();
        while(i<str.length() && j<str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                ans=Math.max(ans,j-i);
            }
            else {
                set.remove(str.charAt(i++));
            }
        }
        return ans;

    }

   


    public static void main(String[] args) {
        // Input string
        String str = "AbDFAAbDfh";

        // Find and display the longest repeating sequence
        String result = findLongestRepeatingSequence(str);

        int result1 = longestRepeatingSubsequences(str);

        int result2 = lengthOfLongestSubstring(str);

        if (result.isEmpty()) {
            System.out.println("No repeating sequence found."+ result2);
        } else {
            System.out.println("Longest repeating sequence: " + result2);
        }
    }
}