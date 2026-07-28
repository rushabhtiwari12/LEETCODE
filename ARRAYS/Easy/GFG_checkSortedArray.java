package Easy;

import java.util.Scanner;

public class GFG_checkSortedArray {

    public boolean sortArray(int[] nums){
        int n = nums.length;
        for(int i =1;i<n;i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        } 
        GFG_checkSortedArray obj = new  GFG_checkSortedArray();
        System.out.println(obj.sortArray(arr));
    }
}
