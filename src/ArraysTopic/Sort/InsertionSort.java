package ArraysTopic.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else break;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {59, 34, 41, 110, 2};
        int[] ans = insertionSort(arr);
        System.out.print(Arrays.toString(ans));
    }
}
