package algorithm_nolookcoding;

public class QuickSort {

    /**
     * #알고리즘
     * [1] left idx와 right idx가 교차하기 전까지만 돌고 종결
     * [2] pivot 선정(left)
     * [2-1] pivot보다 큰동안 j--
     * [2-2] pivot보다 작은동안 i++
     * [2-3] swap(i,j) 반복
     * [2-4] 최종적으로 pivot(left)과 마지막으로 바꾼 arr[i] swap
     * [3] pivot을 제외하고 left ~ pivot-1 , pivot+1 ~ right에 대해 재귀호출
     *
     * #Time
     * 최악 : O(N^2) -> pivot이 최대/최소값인 경우, 다시말해 역정렬되어있는 경우
     * 최선 : O(NlogN) -> 깊이가 logN, iteration이 N회이므로
     *
     * #Space
     * O(logN)
     *
     * #비고
     * 빠르다, 정렬된 배열에 한해 최악의 성능
     *
     * */

    public static int[] quickSort(int[] arr){


    }
    private static void quickSortRecur(int[] arr, int left, int right){


    }
    private static int partition(int[] arr, int left, int right){

    }

    private static void swap(int[] arr, int i, int j){

    }
}
