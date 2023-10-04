package com.untangle.dsalgoprep.algorithms.sorting;

public class BubbleSortDemo {

    /* Sorts heavy elements to right side one at a time 
    * eventually left elements would be light ( rocks to right, then comes sand, then comes bubbles) 
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
