package ArraysTopic;

import java.util.Scanner;

class Insert{
public char[] insert(char[] arr, char ele, int index){
    char[] ans = new char[arr.length+1];
    ans = arr;
    int j = ans.length-1;
    for(int i=j;i>=index;i--){
        ans[i] = ans[i-1];
    }
    ans[index-1]=ele;
    return ans;
}
}
public class InsertElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String element;
        System.out.println("Enter the element: ");
        element = sc.next();
        char ch = element.charAt(0);
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        char[] arr = {'a','b','c','d','e'};
        Insert obj = new Insert();
        char[] ans = obj.insert(arr, ch, index);
        for(int i=0;i<=ans.length-1;i++){
            System.out.println(ans[i]);
        }
    }
}
