package algorithms;

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
     *  O(N)
     *
     * */
    public static int[] bubbleSort(int[] arr){
        int tmp;
        for(int i = 0; i < arr.length; i++){ // [1]
            for(int j = 1; j < arr.length - i; j++){ // [2]
                if(arr[j] < arr[j - 1]){ // [3]
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }
}
