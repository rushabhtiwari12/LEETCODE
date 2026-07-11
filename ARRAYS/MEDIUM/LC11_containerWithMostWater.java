package MEDIUM;
import java.util.Scanner;

public class LC11_containerWithMostWater {

    public int maxArea(int[] arr){
        int n = arr.length;
        int l =0;
        int r = n-1;
        int max1 = Integer.MIN_VALUE;
        while(l<r){
            int width=r-l;
            int height = Math.min(arr[l], arr[r]);
            int Area = width*height;
            if(Area>max1){
                max1 = Area;
            }
            if(arr[l]<arr[r]) l++;
            else if(arr[l]>arr[r]) r--;
            else{
                l++;
                r--;
            }

        }
        return max1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements inside the array");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        LC11_containerWithMostWater obj = new LC11_containerWithMostWater();
        System.out.println(obj.maxArea(nums));
    }

}
