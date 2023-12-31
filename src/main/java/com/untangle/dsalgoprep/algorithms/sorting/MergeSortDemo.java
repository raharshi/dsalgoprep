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

    private static void mergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        int mid = n/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n-mid];
        int j=0;
        int i =0;
        for(; i<n;i++){
            if(i<mid){
                leftArr[i]=arr[i];
            }else{
                rightArr[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr,rightArr);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize =rightArray.length;
        int i=0, l=0, r=0;  //indices

        // check the conditions for merging
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
