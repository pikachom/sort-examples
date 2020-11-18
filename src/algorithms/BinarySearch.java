package algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int mid;
        while(left <= right){
            mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid - 1;

            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
