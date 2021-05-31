package algorithm_nolookcoding;

import java.util.Arrays;

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


    public int[] selectionSort(int[] arr){
        for(int target = 0; target < arr.length - 1; target++){
            int min = target;
            for(int i = target + 1; i < arr.length; i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            swap(arr, target, min);
        }
        return arr;
    }
    private void swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        int[] input = {4,2,3,1,5,9,8,7,6};
        SelectionSort test = new SelectionSort();
        System.out.println(Arrays.toString(input));
        test.selectionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
