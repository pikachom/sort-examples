package algorithmtests;

import java.util.Arrays;

public class SelectionSortTest {
    public void selectionSort(int[] arr){
        int minIdx, tmp;
        for(int i = 0; i < arr.length - 1; i++){
            minIdx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;


        }
    }

    public static void main(String[] args) {
        int[] arr = {4,9,10,1,0,33};
        SelectionSortTest test = new SelectionSortTest();
        test.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
