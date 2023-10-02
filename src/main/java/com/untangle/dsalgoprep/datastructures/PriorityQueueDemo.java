package com.untangle.dsalgoprep.datastructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        createPriorityQueue();
    }

    private static void createPriorityQueue(){
        Queue<Double> queue = new PriorityQueue<Double>();
        
        queue.offer(4.0);
        queue.offer(2.5);
        queue.offer(1.8);
        queue.offer(3.0);
        queue.offer(3.2);

         Queue<String> stringQueue = new PriorityQueue<String>(Collections.reverseOrder());
         stringQueue.offer("F");
        stringQueue.offer("D");
        stringQueue.offer("G");
        stringQueue.offer("C");
        stringQueue.offer("A");
        System.out.println(stringQueue);
        System.out.println(stringQueue.peek());
        System.out.println("Priority Queue::");
        while(!stringQueue.isEmpty()){
            System.out.println(stringQueue.poll());
        }
        
    }
}
