package com.untangle.dsalgoprep.algorithms.sorting;

public class MergeSortDemo {
    /*
     * Breaks to sub arrays until they break into single elements, 
     * then sort them by comparing and merge together into the final array.
     */

    /*
     * Complexity
     * Quasilinear time O(n log n)
     * Constant Space O(n) - as we break arrays into sub arrays
     * Large Data sets - Good Compared to Bubble, Insertion, Selection sorting techniques.
     */
    public static void main(String[] args){
        int array[] = {8,2,5,3,4,7,6,1};

        mergeSort(array);

        for(int i: array){
            System.out.print(i +", ");
        }
    }

    private static void mergeSort(int[] array){
        int length = array.length;
        if(length<=1) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i=0;
        int j=0;
        for(; i < length;i++){
            if(i< middle){
                leftArray[i]= array[i];
            }else{
                rightArray[j]=array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = leftArray.length;
        int rightSize =rightArray.length;
        int i=0, l=0, r=0;  //indices

        while(l< leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l<leftSize){
            array[i] = leftArray[l];
                i++;
                l++;
        }

        while(r<rightSize){
            array[i] = rightArray[r];
                i++;
                r++;
        }
    }
}
