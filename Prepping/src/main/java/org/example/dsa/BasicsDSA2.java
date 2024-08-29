package org.example.dsa;

import java.util.*;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.TreeMap;

public class BasicsDSA2 {
    public static void main(String[] args) {
        
    // stack();
// queue();
// tree();
// hashing();
// secMaxFreq();
// vectorString();
// stringBuilder();

// System.out.println(fibonacci(3));
fib(5);
    }

    private static int fibonacci(int n) {
        
                if(n==0) return 0;
                if(n==1) return 1;
                int res=fibonacci(n-1)+ fibonacci(n-2);
                return res;
            
        }

        private static void fib(int num){
            int num1=0;
                int num2=1;
            System.out.println(num1);
            System.out.println(num2);
            // int temp=0;
            for(int i=0;i<num;i++){
               int temp=num1+num2;
                System.out.println(temp);
                num1=num2;
                num2=temp;
            }

        }
    

    private static void stringBuilder() {
        String s="hanah";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
    }

    private static void vectorString() {
        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        System.out.println(s);
        char a;
        int len=s.size()-1;
        for(int i=0;i<s.size()/2;i++){
            a=s.get(i);
            s.set(i,s.get(len));
            s.set(len--,a) ;
        }

        System.out.println(s);


    }

    private static void secMaxFreq() {
        int nums[]= {10,9,9,7,7,4,4,3,32,2,3,3};
        int maxFreq=0;
        int secondMaxFreq=0;
        int mostFreqElement=Integer.MAX_VALUE;
        int secondMostFreqElement=Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();

     for(int num:nums)
     {
        map.put(num,map.getOrDefault(num,0)+1);
     }

     for(int key :map.keySet())
     {
        int frequency=map.get(key);
        
        if(frequency>maxFreq){
            secondMaxFreq=maxFreq;
            secondMostFreqElement=mostFreqElement;
            maxFreq=frequency;
            mostFreqElement=key;
        }
        else if(frequency>secondMaxFreq&& frequency<maxFreq){
            secondMostFreqElement=key;
            secondMaxFreq=frequency;
        }
        else if( frequency== secondMaxFreq&& key<secondMostFreqElement){
                secondMostFreqElement=key;
        }
     }
System.out.println(secondMostFreqElement);
    //  return secondMostFreqElement==0 ? -1:secondMostFreqElement;

    }

    private static void hashing() {
        int nums[]= {10,9,9,7,7};
        int maxfreq=0;
     int mostmaxfreq=Integer.MAX_VALUE;
     Map<Integer,Integer> map=new HashMap<>();
    for(int num:nums){
          map.put(num,map.getOrDefault(num,0)+1);
     }

     for(int key:map.keySet()){
        int frequency= map.get(key);

        if(frequency>maxfreq){
            maxfreq=frequency;
            mostmaxfreq=key;
        }
        else if(frequency==maxfreq && key<mostmaxfreq){
            mostmaxfreq=key;
        }

     }

   
        System.out.println(map);
        System.out.println(mostmaxfreq);
        
    }

    private static void tree() {
    TreeSet<Integer> tr=new TreeSet<>();

    tr.add(12);
    tr.add(14);
    tr.add(11);

    System.out.println(tr);//sorted by default
    Queue<Integer> que=new ArrayDeque<>();
    que.add(13);
    que.add(19);
    que.add(11);
    tr.addAll(que);
    System.out.println(tr.last());//sorted by default    
    System.out.println(tr.size());
TreeMap<Integer,Integer> trmap=new TreeMap<>();
trmap.put(12,1);
trmap.put(11,2);
trmap.put(14,3);

System.out.println(trmap.ceilingKey(13));//Shows the nearest high value

System.out.println(trmap);


    }

    private static void queue(){
        Queue<Integer> que=new ArrayDeque<>();//PriorityQueue,ArrayDeque,LinkedList. Because Queue is interface
        que.add(13);
        que.add(10);
        que.add(11);

        System.out.println(que.poll());

        que.forEach(a-> System.out.println("Each element "+a));

        // que.clear();

        System.out.println(Arrays.toString(que.toArray()));

        System.out.println(que.offer(13));
        System.out.println(que);
    }

    private static void stack() {
        Stack<Integer> stack=new Stack<>();


            stack.push(13);
            stack.push(10);
            stack.push(11);

            // stack.pop();


            System.out.println(stack.peek()+ " shows the last element");

            System.out.println(stack.size()+ " shows the size ");

            System.out.println(stack.capacity()+ " shows the  capacity ");// minimum capacity is 10*2 comes from the Vector class

            Iterator<Integer> itr= stack.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
    }

}
