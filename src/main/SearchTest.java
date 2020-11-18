package main;

import algorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchTest {
    public static void main(String[] args) {
        int[] testArr1 = new int[100];
        for(int i = 0; i < testArr1.length; i++){
            double dValue = Math.random();
            int iValue = (int)(dValue * 100);
            testArr1[i] = iValue;
        }
        System.out.println(Arrays.toString(testArr1));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter target value : ");
        int targetValue = sc.nextInt();

        int result = BinarySearch.binarySearch(testArr1, targetValue);
        System.out.println("result is : " + result);
    }
}
