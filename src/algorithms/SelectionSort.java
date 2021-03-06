package algorithms;

public class SelectionSort {
    /**
     * #알고리즘
     * [1] 바꿀 타겟 인덱스 선택
     * [2] 타겟 인덱스 다음원소부터 끝까지 가장 작은 인덱스 찾아서 갱신
     * [3] minIndex와 타겟인덱스 swap
     *
     * #Time
     * (n-1) + (n-2) + ... + 2 + 1 = n(n-1)/2 ~> O(N^2)
     *
     * #Space
     * O(1)
     *
     * #비고
     * BubbleSort에 비해 스왑 횟수가 적고 비교 횟수가 많다
     *
     * */


    public static int[] selectionSort(int[] arr){
        int minIndex, tmp;
        for(int i = 0; i < arr.length - 1; i++){ // [1]
            minIndex = i;
            for(int j = i + 1; j < arr.length; j++){ // [2]
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // [3]
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}
