package ArraysTopic.Sort;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {33, 7, 1, 99, 36, 12};
        int[] ans = mergeSort(arr);
        for(int a : ans){
            System.out.println(a);
        }
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1)
            return arr;
        int middle = arr.length/2;
        int[] left = mergeSort(helper(arr, 0, middle));
        int[] right = mergeSort(helper(arr, middle, arr.length));
        return merge(left, right);
    }
    private static int[] merge(int[] lhs, int[] rhs){
        int arr[] = new int[lhs.length + rhs.length];
        int i = 0, j = 0, k = 0;
        while(i<lhs.length && j<rhs.length){
            if(lhs[i]<rhs[j]) {
                arr[k] = lhs[i];
                i++;
                k++;
            }else{
                arr[k] = rhs[j];
                j++;
                k++;
            }
        }
        while(i < lhs.length ){
                arr[k] = lhs[i];
                i++;
                k++;
        }
        while(j < rhs.length){
            arr[k] = rhs[j];
            j++;
            k++;
        }
        return arr;
    }
    private static int[] helper(int[] arr, int start, int end) {
        int size = end-start;
        int count = 0;
        int[] arr1 = new int[size];
        while(count<size){
            arr1[count] = arr[start];
            count++;
            start++;
        }
        return arr1;
    }
}
