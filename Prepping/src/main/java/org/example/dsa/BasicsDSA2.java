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
tree();
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
