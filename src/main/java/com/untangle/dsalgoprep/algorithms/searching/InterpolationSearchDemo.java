package com.untangle.dsalgoprep.algorithms.searching;

public class InterpolationSearchDemo {
    /* Improvement over Binary Search, best used for "Uniformly" distributed "guesses" where a value might be based
     * on calculate probe results.
     * If probe is incorrect, search area is narrowed, and new probe is calculated.
     * 
     * average case: O(log(log n))
     * worst case: O(n) when elements are in sequential order (2,4,6,8,...)
    */

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        int index= interpolationSearch(array, 1);
        if(index ==-1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index:: "+index);
        }
    }

    private static int interpolationSearch(int[] array, int target){
        int high = array.length-1;
        int low= 0;
        while(array[low] <= target && array[high] >= target && low<=high){
            int probe = low+(high-low)*(target- array[low])/
            (array[high]-array[low]);
            
            System.out.println("Probe:: "+probe);

            if(array[probe]==target){
                return probe;
            }else if (array[probe] < target){
                low = probe+1;
            }else{
                high = probe -1;
            }

        }
        return -1;

    }
}
