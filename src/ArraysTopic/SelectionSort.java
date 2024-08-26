package ArraysTopic;

import java.util.Arrays;

public class SelectionSort {
    static int[] selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int end = arr.length-1;
            int index = findMinIndex(arr, i, end);
            swap(arr, i, index);
        }

        return arr;
    }
    static void swap(int[] arr, int swapHere, int swapThis){
        int temp = arr[swapHere];
        arr[swapHere] = arr[swapThis];
        arr[swapThis] = temp;
    }
    static int findMinIndex(int[] arr, int start, int end) {
        int index = start; // Initialize index to start
        int minValue = arr[start]; // Store the minimum value

        while (start <= end) {
            if (arr[start] < minValue) {
                minValue = arr[start];
                index = start;
            }
            start++;
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {3,6,2,4,1,5};
        System.out.println(Arrays.toString(selection(arr)));
    }
}
