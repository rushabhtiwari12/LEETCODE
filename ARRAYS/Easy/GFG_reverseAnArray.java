package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class GFG_reverseAnArray {
    public int[] reverseArr(int[] nums){
        int n = nums.length;
        for(int i =0;i<n/2;i++){
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        }
        return nums;
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
        GFG_reverseAnArray obj = new GFG_reverseAnArray();
        System.out.println(Arrays.toString(obj.reverseArr(arr)));
    }
}
