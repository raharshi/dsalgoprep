package com.untangle.dsalgoprep.algorithms.sorting;

public class InsertionSortDemo {

    /*
     * Shifts all left elements to right if greater than temp value, starts with index.
     * we put the selected element in temp for comparison and swapping.
     */
    
    /*
     * Complexity
     * Quadratic time O(n^2)
     * Constant Space O(1) -- as we don't create any new arrays
     * small dataset - decent
     * large dataset - BAD
     */

    public static void main(String[] args){

        int[] array = {9,1,8,2,7,3,6,5,4};


        insertionSort(array);
        for(int i : array){
            System.out.print(i+", ");
        }

    }

    private static void insertionSort(int array[]){
        for(int i =1;i < array.length; i++){
            int temp = array[i];
            int j = i-1;
            while(j >=0 && array[j]>temp){
                    array[j+1]= array[j];
                    j--;
            }
            array[j+1]= temp;
        }
    }
}
