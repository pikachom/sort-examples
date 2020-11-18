package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RadixSort {
    public static int[] radixSort(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("최대값의 범위를 입력하세요(1, 10, 100, ...)");
        int maxRadix = sc.nextInt();
        return radixSortHelper(arr, maxRadix);
    }
    private static int[] radixSortHelper(int[] arr, int maxRadix){
        ArrayList<Queue<Integer>> bucket = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Queue<Integer> queue = new LinkedList<>();
            bucket.add(queue);
        }

        for(int i = 1; i < maxRadix; i = i * 10){
            for(int j = 0; j < arr.length; j++){
                int index;
                if(i > arr[j]){
                    index = 0;
                }else{
                    index = (arr[j] / i) % 10;
                }
                bucket.get(index).add(arr[j]);
            }
            int x = 0;
            for(int j = 0; j < bucket.size(); j++){
                while(!bucket.get(j).isEmpty()){
                    arr[x] = bucket.get(j).poll();
                    x++;
                }

            }

        }
        return arr;
    }
}
