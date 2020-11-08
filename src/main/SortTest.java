package main;


import algorithms.*;
import java.util.Arrays;
import java.util.Scanner;



public class SortTest {
    public static void main(String[] args) {
        int[] testArr1 = new int[100];
        for(int i = 0; i < testArr1.length; i++){
            double dValue = Math.random();
            int iValue = (int)(dValue * 100);
            testArr1[i] = iValue;
        }
        System.out.println(Arrays.toString(testArr1));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter sort algorithm name : ");
        String selectedSort = sc.nextLine();

        int[] result;
        switch(selectedSort){
            case("BubbleSort") :
                result = BubbleSort.bubbleSort(testArr1);
                break;
            case("SelectionSort") :
                result = SelectionSort.selectionSort(testArr1);
                break;

            case("InsertionSort") :
                result = InsertionSort.insertionSort(testArr1);
                break;
            case("QuickSort") :
                result = QuickSort.quickSort(testArr1);
                break;
            case("MergeSort") :
                result = MergeSort.mergeSort(testArr1);
                break;

            default:
                result = new int[0];
                System.out.println("Wrong algorithm name");
        }
        System.out.println(Arrays.toString(result));




    }
}
