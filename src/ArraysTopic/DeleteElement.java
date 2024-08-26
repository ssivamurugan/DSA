package ArraysTopic;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int ele = 5;
        DeleteElement.delete(arr, ele);
    }
    public static void delete(int[] arr, int ele){
        int index = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==ele){
                index = i;
                break;
            }
        }
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        int[] ans = new int[arr.length-1];
        for(int i=0;i<=ans.length-1;i++){
            ans[i]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
