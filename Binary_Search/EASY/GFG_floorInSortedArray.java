package Binary_Search.EASY;

import java.util.Arrays;
import java.util.Scanner;

public class GFG_floorInSortedArray {
    public int floor(int[]  arr, int target){
        int n = arr.length;
        int l =0;
        int r = n-1;
        int floor =0;
        while(l<=r){
            int mid = (l+r)/2;
            if(target>=arr[mid]){
                floor = mid;
            l=mid+1;
            }else{
                r = mid-1;
            }
        }
        return floor;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        } 
        GFG_floorInSortedArray obj = new GFG_floorInSortedArray();
        System.out.println(obj.floor(arr, target));
    }
}
