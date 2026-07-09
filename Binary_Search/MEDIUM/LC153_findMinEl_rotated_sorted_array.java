import java.util.Scanner;

public class LC153_findMinEl_rotated_sorted_array {
    public int Min_Element(int[] nums){
        int n = nums.length;
        int l =0;
        int r = n-1;
        int min1 = Integer.MAX_VALUE;
        if(nums[l]<nums[r]){
            return  nums[l];
        }
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]<min1){
                min1 = nums[mid];
            }
            if(nums[mid]<=nums[r]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return nums[l]; //or return min1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements in the array");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        LC153_findMinEl_rotated_sorted_array obj  = new LC153_findMinEl_rotated_sorted_array();
        System.out.println("The minimum element in a rotated sorted array");
        System.out.println(obj.Min_Element(arr));

        sc.close();
    }
}
