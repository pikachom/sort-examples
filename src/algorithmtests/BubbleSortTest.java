package algorithmtests;

import java.util.Arrays;

public class BubbleSortTest {
    public void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,5,4,2,0};
        BubbleSortTest test = new BubbleSortTest();
        test.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
