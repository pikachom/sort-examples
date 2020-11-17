package algorithms;

public class HeapSort {
    public static int[] heapSort(int[] arr){
        //[1]init(heapify)
        for(int i = (arr.length /2) - 1; i >= 0; i-- ){
            heapify(arr, arr.length, i);
        }
        //[2]swap 0 <-> arr.length - 1 & heapify(n - 1)
        for(int i = arr.length - 1; i > 0; i--){
            swap(arr, i, 0);
            heapify(arr, i - 1, 0);
        }


        return arr;
    }
    private static void heapify(int[] arr, int size, int pNode){
        int newParent = pNode;
        int lNode = newParent * 2 + 1;
        int rNode = newParent * 2 + 2;

        if(size > lNode && arr[lNode] > arr[newParent]){
            newParent = lNode;
        }
        if(size > rNode && arr[rNode] > arr[newParent]){
            newParent = rNode;
        }

        if(newParent != pNode){
            swap(arr, pNode, newParent);
            heapify(arr, size, newParent);
        }

    }
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
