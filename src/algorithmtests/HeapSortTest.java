package algorithmtests;

import java.util.Arrays;

public class HeapSortTest {
    public void heapSort(int[] arr){
        //[1]heapify all
//        System.out.println("heapify!!");
        for(int i = (arr.length / 2) - 1; i >= 0; i--){
            heapify(arr, arr.length - 1, i);

        }
        //[2]swap 0 <-> last , heapify length--
        for(int i = arr.length - 1; i > 0; i--){
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    private void heapify(int[] arr, int length, int pNode){
        int newParent = pNode;
        int lNode = pNode * 2 + 1;
        int rNode = pNode * 2 + 2;
        if( lNode < length && arr[newParent] < arr[lNode] ){
            newParent = lNode;
        }
        if( rNode < length && arr[newParent] < arr[rNode] ){
            newParent = rNode;
        }
//        System.out.println("newParent : " + newParent);
        if(pNode != newParent){
            swap(arr, pNode, newParent);
            heapify(arr, length, newParent);
        }
    }
    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,3,1,4,5,6,8,7};
        HeapSortTest test = new HeapSortTest();
        test.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
