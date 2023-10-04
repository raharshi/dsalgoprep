package com.untangle.dsalgoprep.algorithms.searching;

public class LinearSearchDemo {
    /*** Linear Search:: Iterates through collection one element at a time - O(n)***/
    public static void main(String[] args) {
        int[] array = {3,5,7,9,1,2,8};

        System.out.println(linearSearch(array, 7));
    }

    private static int linearSearch(int[] array, int element){
        for(int i =0; i < array.length; i++){
            if(element==array[i]){
                return i;
            }
        }
        return -1;
    }
}
