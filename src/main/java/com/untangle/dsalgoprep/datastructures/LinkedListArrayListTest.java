package com.untangle.dsalgoprep.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        /******************LinkedList*************/
            startTime = System.nanoTime();
        
        /*Array List performs better than Linked List in searching, as it has random access feature */
        /****************** Searching ***********/

            // linkedList.get(0);
            // linkedList.get(500000);
            // linkedList.get(999999);

        /* LinkedList Performs better than ArrayList when deleting element in the start or end,
            but takes more time if the element is in the middle as it takes more time to traverse to middle*/

        /****************** Deletion ***********/
            // linkedList.remove(0);
            // linkedList.remove(500000);
            linkedList.remove(999999);

            endTime = System.nanoTime();
            elapsedTime = endTime-startTime;
            System.out.println("LinkedList:: "+elapsedTime+"ns");

        /******************ArrayList*************/

            startTime = System.nanoTime();
            
        /*Array List performs better than Linked List in searching, as it has random access feature */
        /****************** Searching ***********/
            // arrayList.get(0);
            // arrayList.get(500000);
            // arrayList.get(999999);

        /* LinkedList Performs better than ArrayList when deleting element in the start or end,
            but takes more time if the element is in the middle as it takes more time to traverse to middle*/

        /****************** Deletion ***********/
            // arrayList.remove(0);
            // arrayList.remove(500000);
            arrayList.remove(999999);

            endTime = System.nanoTime();
            elapsedTime = endTime-startTime;
            System.out.println("ArrayList:: "+elapsedTime+"ns");
    }
}
