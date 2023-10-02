package com.untangle.dsalgoprep.datastructures;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        createLinkedList();    
    }
    
    private static void createLinkedList(){
        LinkedList<String> list = new LinkedList<String>();

        // use linkedlist as stack
        // list.push("A");
        // list.push("B");
        // list.push("C");
        // list.push("D");
        // list.push("F");
        // System.out.println(list.peek());
        // list.pop();
        // System.out.println(list);

        // use linkedlist as queue
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");
        // System.out.println(list.peek());
        // list.poll();

        list.add(4, "E");
        // list.remove("E");
        // list.remove(4);

        // System.out.println(list.pollFirst());
        // System.out.println(list.pollLast());
        // System.out.println(list.peekFirst());
        // System.out.println(list.peekLast());
        
        // String first = list.removeFirst();
        // String last = list.removeLast();
        // System.out.println(first+"::"+last);
        list.addFirst("0");
        list.addLast("G");
    
       System.out.println(list.indexOf("E"));


        System.out.println(list);

        


    }
}
