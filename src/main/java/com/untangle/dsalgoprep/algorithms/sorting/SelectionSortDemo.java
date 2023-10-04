package com.untangle.dsalgoprep.algorithms.sorting;

public class SelectionSortDemo {

    /*
     * Selects the minimum number by comparing from the beginning per iteration.
     * Uses one min variable to store minimum value and a temp variable to swap.
     */

    /*
     * Complexity
     * Quadratic time O(n^2)
     * small dataset - okay-ish
     * large dataset - BAD
     */

    public static void main(String[] args){
      int[] array = {8,7,9,2,3,1,5,4,6};

      selectionSort(array);

      for(int i:array){
        System.out.print(i+", ");
      }
    }

    private static void selectionSort(int[] array){
      for(int i =0; i < array.length; i++){
        int min =i;
        for(int j =i+1; j < array.length; j++){
          if(array[min] > array[j]){
            min = j;
          }
        }
        int temp = array[i];
        array[i]= array[min];
        array[min] = temp;
      }
    }
}
