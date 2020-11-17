package algorithmtests;

import java.util.Arrays;

public class InsertionSortTest {
    public void insertionSort(int[] arr){
        int tmp, prevIdx;
        for(int i = 1; i < arr.length; i++){
            prevIdx = i - 1;
            tmp = arr[i];
            while(prevIdx >= 0 && (tmp < arr[prevIdx])){
                arr[prevIdx + 1] = arr[prevIdx];
                prevIdx--;
            }
            arr[prevIdx + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        InsertionSortTest test = new InsertionSortTest();
        int[] arr = {5,4,3,2,1};
        test.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
