```
package com.example.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ZemosoLabs{

    public static void main(String[] args) {
    String str="aaaaBbbbCDEaAb";

    Map<Character,Long> map=str.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println("map"+map.entrySet());

    for(Map.Entry<Character,Long> nMap:map.entrySet()){
// System.out.println(nMap.getKey());
    }

    map.forEach((k,v)->System.out.println("k "+k+" v "+v));

    Long[] ch= map.values().stream().toArray(Long[]::new);

    // Character[] ch1= map.values().stream().toArray(new Character[0]);

    System.out.println(Arrays.toString(ch));

    String str1="";

    char[] charStr=str.toCharArray();

    int len=str.length()-1;

    for(int i=0;i<str.length()/2;i++){
        char temp=charStr[i];
        charStr[i]=charStr[len];
        charStr[len--]=temp;
    }

    System.out.println(Arrays.toString(charStr));

    System.out.println(new StringBuilder(str).reverse().toString());

    int[] arr={1,2,4,3,5,3,5632,10};
    List<Integer> lst=Arrays.asList(1,2,3,4,5,8);
    lst.forEach(System.out::println);

    List<Integer> lst1=Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).toList();

System.out.println("lst1  "+lst1);
int min=lst1.stream().min(Comparator.naturalOrder()).get();

int sum = lst1.stream().mapToInt(Integer::intValue).sum();

Integer a=Collections.max(lst1);


int[] arr1={0,2,0,3,0,3,0,0};

int count=0;
for(int i=0;i<arr1.length;i++){

    if(arr1[i]!=0){     
        int temp=arr1[i];
        arr1[i]=arr1[count];
        arr1[count++]=temp;
    }

    
}

System.out.println(Arrays.toString(arr1));




    int temp=Arrays.stream(arr).sorted().skip(1).findFirst().orElse(0);

    System.out.println(temp);
    }

}
```
