package Easy;

import java.util.Scanner;

public class GFG_2ndLargestElement_Better{

    public int secondLargestElement(int[] nums){
        int n = nums.length;
        int lmax = -1;
        int smax = -1;
        for(int i =0;i<n;i++){
            if(nums[i]>lmax){
                lmax = nums[i];
            }
        }
        for(int i =0; i<n;i++){
            if(nums[i]!=lmax && nums[i]>smax){
                smax = nums[i];
            }
        }
        return smax;
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
        GFG_2ndLargestElement_Better obj = new GFG_2ndLargestElement_Better();
        System.out.println(obj.secondLargestElement(arr));
        System.out.println("TC->O(2N), SC->O(1)");
    }
}