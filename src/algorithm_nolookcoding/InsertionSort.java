package algorithm_nolookcoding;

import java.util.Arrays;

public class InsertionSort {

    /**
     * #알고리즘
     * [1] 타겟 인덱스의 값을 선택함
     * [2] prevIdx가 양수, prevIdx의 값이 타겟값보다 큰 동안 값을 한칸씩 밀어줌
     * [3] prevIdx + 1 번째 칸에 타겟값을 "삽입"함
     *
     * #Time
     * 최악 : O(N^2)
     * 최선 : O(N) -> 이미 정렬되어있던 경우
     *
     * #Space
     * O(1)
     *
     * #비고
     * SelectionSort와 유사하지만, k번재 원소를 정렬하기 위해 항상 (k+1)~끝까지 탐색할필요는 없어서 더 효율적
     * */


    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int prev = i - 1;
            int insertVal = arr[i];
            while( prev >= 0 && insertVal < arr[prev]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = insertVal;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] input = {4,2,3,1,5,9,8,7,6};
        InsertionSort test = new InsertionSort();
        System.out.println(Arrays.toString(input));
        test.insertionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
