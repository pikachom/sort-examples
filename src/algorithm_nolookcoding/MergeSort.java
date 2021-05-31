package algorithm_nolookcoding;

import java.util.Arrays;

public class MergeSort {

    /**
     * #Time
     * 항상 O(NlogN)
     * #Space
     * N(엑스트라스페이스) + logN(콜스택) = O(N)
     * */

    public int[] mergeSort(int[] arr){
        mergeSortRecur(arr, 0, arr.length - 1);
        return arr;
    }
    private void mergeSortRecur(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSortRecur(arr, left, mid);
            mergeSortRecur(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private void merge(int[] arr, int left, int mid, int right){
        int[] leftPart = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightPart = Arrays.copyOfRange(arr, mid + 1, right + 1);
        int lIdx = 0;
        int rIdx = 0;
        int idx = left;
        while(lIdx < leftPart.length && rIdx < rightPart.length){
            if(leftPart[lIdx] < rightPart[rIdx]){
                arr[idx] = leftPart[lIdx];
                lIdx++;
            }else{
                arr[idx] = rightPart[rIdx];
                rIdx++;
            }
            idx++;
        }
        if(lIdx < leftPart.length){
            //왼쪽파트가 남은상황
            while(lIdx < leftPart.length){
                arr[idx] = leftPart[lIdx];
                lIdx++;
                idx++;
            }
        }else{
            while(rIdx < rightPart.length){
                arr[idx] = rightPart[rIdx];
                rIdx++;
                idx++;
            }
        }



    }
    public static void main(String[] args) {
        int[] input = {4,2,3,1,5,9,8,7,6};
        MergeSort test = new MergeSort();
        System.out.println(Arrays.toString(input));
        test.mergeSort(input);
        System.out.println(Arrays.toString(input));
    }
}
