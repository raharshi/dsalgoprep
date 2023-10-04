package com.untangle.dsalgoprep.algorithms.sorting;

public class QuickSortDemo {
    
    /*
     * QuickSort is a recursive algorithm with divide and conquer rule. 
     * We use a pivot and compare it elements starting from beginning i(index 0 -1), j(index 0). 
     * if j is greater than pivot we ignore swapping and increment j. if j is lessthan pivot increment i and swap j and i values.
     * when you hit the end, swap pivot with i+1.
     * split array into 2 (before pivot and after pivot), apply same logic
     * merge back after sorting.
     * 
     * moves smaller elements to the left of pivot, recursively divide array in 2 partitions
     */

    /*
      * Complexity
      * Best case O(n log n)
      * Average case O(n log n)
      * Worst case O(n^2) if already sorted
      * O(log n ) space. due to recursion
      */

    public static void main(String[] args){
        
        int[] array = {8,2,5,3,9,4,7,6,1};

        quickSort(array, 0, array.length-1);

        for(int i : array){
            System.out.print(i+", ");
        }
    }

    private static void quickSort(int[] array, int start, int end){
        if(end <= start) return; // base case.

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);

    }

    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start -1;
        for(int j=start; j <= end -1;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end]= temp;
        return i;
    }
}
