package com.untangle.dsalgoprep.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){
        createQueue();
    }
    

    private static void createQueue(){
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Mr.A");
        queue.offer("Mrs.B");
        queue.offer("Mr.C");
        queue.offer("Mr.D");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println("Queue:: "+queue);
        
    }   
}


