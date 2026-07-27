package Easy;

import java.util.Scanner;

public class GFG_largestElementInArray {
    public int largestElement(int[] nums){
        int n = nums.length;
        int lmax =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]>lmax){
                lmax = nums[i];
            }
        }
        return lmax;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of the array");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        GFG_largestElementInArray obj = new GFG_largestElementInArray();
        System.out.println(obj.largestElement(arr));
    }
}
