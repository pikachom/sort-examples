package algorithmtests;

import java.util.Arrays;

public class MergeSortTest {
    public void mergeSort(int[] arr){
        mergeSortRecur(arr, 0, arr.length - 1);
    }
    private void mergeSortRecur(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int mid = (left + right) / 2;
        mergeSortRecur(arr, left, mid);
        mergeSortRecur(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    private void merge(int[] arr, int left, int mid, int right){
        int[] leftHalf = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightHalf = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int leftIdx = 0, rightIdx = 0;
        int originIdx = left;
        while((leftIdx < leftHalf.length) && (rightIdx < rightHalf.length)){
            if(leftHalf[leftIdx] < rightHalf[rightIdx]){
                arr[originIdx++] = leftHalf[leftIdx++];
            }else{
                arr[originIdx++] = rightHalf[rightIdx++];
            }
        }
        while(rightIdx < rightHalf.length){
            arr[originIdx++] = rightHalf[rightIdx++];
        }
        while(leftIdx < leftHalf.length){
            arr[originIdx++] = leftHalf[leftIdx++];
        }

    }

    public static void main(String[] args) {
        MergeSortTest test = new MergeSortTest();
        int[] arr = {10,5,4,1,2,7,8,9};
        test.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
