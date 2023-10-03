package com.untangle.dsalgoprep.datastructures;

import java.util.Arrays;

public class BinarySearchDemo {
    /*** Finds the index of a target value in a sorted array ***/
    /* Half of the array is eliminated per iteration and has O(log n) complexity*/

    public static void main(String[] args){
        int[] array = new int[100];
        int target = 35;

        for(int i =0; i < array.length; i++){
            array[i]=i+1;
        }

        // int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println("Elment not found.`");
        }else{
            System.out.println("Element is found at "+index+" index.");
        }
    }

    // Binary Search
    private static int binarySearch(int[] array, int target){
        if(array.length ==0){
            return -1;
        }else{
            int low = 0;
            int high = array.length-1;
            while(low<=high){
                // int middle = (low+high)/2;
                int middle = low+(high-low)/2;
                if(array[middle]==target){
                    return middle;
                }else if (array[middle]> target){
                    high = middle-1;
                }else{
                    low = middle+1;
                }
                System.out.println("Middle:: "+middle);
            }
        }
        return -1;
    }
}
