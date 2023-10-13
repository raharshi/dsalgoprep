package com.untangle.dsalgoprep.algorithms.sorting;

public class SortingPractice {
    public static void main(String[] args){
        int[] array = {9,1,8,2,7,3,6,4,5};
        // int[] array = {7,6,10,5,9,2,1,15,7};

        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        mergeSort(array);
        // quickSort(array, 0, array.length-1);
        for(int i: array){
            System.out.print(i+" ");
        }
    }

    private static void swap(int[] arr, int e1, int e2){
        int temp = arr[e2];
        arr[e2]=arr[e1];
        arr[e1]=temp;

    }
    
    private static void bubbleSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        for(int i=0;i<n-1;i++ ){
            boolean swapped = false;
            for(int j=0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    private static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]> temp){
                swap(arr, j+1, j);
                j--;
            }
            arr[j+1]=temp;
        }
    }

    private static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int min =i;
            for(int j = i+1;j<n;j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            if(i!=min){
                swap(arr, min, i);
            }
        }
    }

    private static void quickSort(int[] arr, int lo, int hi){
        if(hi<=lo) return;
        int pivot = partition(arr, lo, hi);
        quickSort(arr, lo, pivot-1);
        quickSort(arr, pivot+1, hi);

    }

    private static int partition(int[] arr, int lo, int hi){
        int pivot = hi;
        int i = lo-1;
        for(int j = lo; j<hi;j++){
            while(arr[j]< arr[pivot]){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,hi);
        return i;

    }

    private static void mergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        int mid = n/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n-mid];
        int i =0,j=0;
        for(; i<n;i++){
            if(i<mid){
                leftArr[i]= arr[i];
            }else{
                rightArr[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int rightArr[]){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int l=0, i=0, r=0;

        while(l<leftSize && r<rightSize){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            }else{
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while(l<leftSize){
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while(r<rightSize){
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}


