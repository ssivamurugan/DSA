package ArraysTopic.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubblesort(int[] arr){
        for(int i=arr.length;i>=0;i--){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {55,8,22,99,1,-73,-1,0};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
}
