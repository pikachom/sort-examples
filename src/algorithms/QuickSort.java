package algorithms;

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
     * O(N)
     *
     * #비고
     * 빠르다, 정렬된 배열에 한해 최악의 성능
     *
     * */

    public static int[] quickSort(int[] arr){

        quickSortRecur(arr, 0, arr.length - 1);
        return arr;
    }
    private static void quickSortRecur(int[] arr, int left, int right){
        //[1] 종결조건
        if(left >= right || arr.length <= 1){
            return;
        }

        //[2] pivot잡고 작은것 왼쪽으로 넘기고 큰것 오른쪽으로 넘김
        int pivot = partition(arr, left, right);

        //[3] pivot을 제외하고 왼쪽과 오른쪽에 대해서 재귀호출
        quickSortRecur(arr, left, pivot - 1);
        quickSortRecur(arr, pivot + 1, right);

    }
    private static int partition(int[] arr, int left, int right){
        int i = left;
        int j = right;
        int pivot = arr[left];
        while(i < j){
            while(pivot < arr[j]){
                j--;
            }
            while(pivot >= arr[i] && i < j){
                i++;
            }
            swap(arr, i, j);
        }

        //맨 왼쪽에 남아있는 pivot과 마지막으로 교환한 원소(i)를 스왑
        swap(arr, left, i);
        //return pivot index
        return i;
    }

    private static void swap(int[] arr, int i, int j){

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
