package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public int[] selectionSort1(int[] nums){
        
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j =i+1;j<n;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp = nums[min];
            nums[min]=nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the array");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort obj = new SelectionSort();
        System.out.println((Arrays.toString(obj.selectionSort1(arr))));
    }
}
