package ArraysTopic.Search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3,6,2,4,1,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        System.out.println(binarySearch(arr, search, 0, arr.length-1));
    }
    public static int binarySearch(int[] arr, int element, int start,int end){
        int middle = start + (end-start) / 2;
        if(start>end)
            return -1;
        if(arr[middle] == element)
            return middle;
        if(arr[middle] < element)
            return binarySearch(arr, element, middle+1, end);
            return binarySearch(arr, element, start, middle-1);
    }
}
