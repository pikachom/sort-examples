package algorithm_nolookcoding;

import java.util.Arrays;

public class BubbleSort {

    /**
     * # 알고리즘
     * [1] 정렬에서 제외되는 원소의 갯수
     * [2] 비교를 위한 index
     * [3] 비교 후 swap
     *
     * # Time
     * n + (n-1) + (n-2) + ... + 1 = n(n-1)/2 ~> O(N^2)
     *
     * # Space
     *  O(1)
     *
     * */
    public int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }
    private void swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,9,8,7,6};
        BubbleSort test = new BubbleSort();
        System.out.println(Arrays.toString(input));
        test.bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }
}
