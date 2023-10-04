package com.untangle.dsalgoprep.algorithms.sorting;

public class BubbleSortDemo {

    /* 
    * Sorts bigger elements to right side one at a time by comparing two elements starting from beginning.
    * eventually left elements would be smaller (like in sea, rocks to bottom, 
    * then comes sand, then comes water and bubbles).
    * Uses single temp variable to swap variables.
    */

    /*
     * Complexity
     * Quadratic time O(n^2)
     * small dataset - okay-ish
     * large dataset - BAD
     */

    public static void main(String[] args) {
        int[] array = {9,1,8,2,7,3,6,4,5};

        bubbleSort(array);
        for(int i=0; i< array.length;i++){
            System.out.print(array[i]+", ");
        }
    }

    private static void bubbleSort(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                int temp;
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
