package algorithms;

import java.util.Arrays;

public class MergeSort {


    public static int[] mergeSort(int[] arr){
        mergeSortRecur(arr, 0, arr.length - 1);
        return arr;
    }
    private static void mergeSortRecur(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSortRecur(arr, left, mid);
            mergeSortRecur(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right){


        int[] leftPartition = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightPartition = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0;
        int idx = left;
        while(i < leftPartition.length && j < rightPartition.length){
            if(leftPartition[i] < rightPartition[j]){
                arr[idx] = leftPartition[i];
                i++;
            }else{
                arr[idx] = rightPartition[j];
                j++;
            }
            idx++;
        }
        while(i < leftPartition.length){
            arr[idx] = leftPartition[i];
            idx++;
            i++;
        }
        while(j < rightPartition.length){
            arr[idx] = rightPartition[j];
            idx++;
            j++;
        }
    }
}
