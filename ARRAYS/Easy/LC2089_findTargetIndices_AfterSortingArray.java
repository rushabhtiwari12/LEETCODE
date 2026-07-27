package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class LC2089_findTargetIndices_AfterSortingArray{

    public ArrayList<Integer> findTargetElement(int[] nums, int target){
        Arrays.sort(nums);
        ArrayList<Integer> list =new ArrayList<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the target Element");
        int target = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements inside the array");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        LC2089_findTargetIndices_AfterSortingArray obj = new LC2089_findTargetIndices_AfterSortingArray();
        System.out.println(obj.findTargetElement(arr, target));
    }
}