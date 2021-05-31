package algorithmtests;



import java.util.Arrays;

public class QuickSortTest {
    public void quickSort(int[] arr){
        quickSortRecur(arr, 0, arr.length - 1);
    }
    private void quickSortRecur(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        //partition
        int pivotIndex = partition(arr, left, right);
//        System.out.println(Arrays.toString(arr));

        //recursive
        quickSortRecur(arr, left, pivotIndex - 1);
        quickSortRecur(arr, pivotIndex + 1, right);
    }

    private int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left;
        int j = right;
        while(i < j){
            while(arr[j] > pivot){
                j--;
            }
            while((arr[i] <= pivot) && (i < j)){
                i++;
            }
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void main(String[] args) {
        QuickSortTest test = new QuickSortTest();
        int[] arr = {0,1,10,6,4,2,3,4};
        test.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
