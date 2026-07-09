import java.util.Scanner;


public class LC33_searchInRotatedSortedArray{

    public int findElement(int[] nums,int target){
        int n = nums.length;
        int l =0;
        int r =n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<=nums[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[r]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the array");
        for(int  i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        LC33_searchInRotatedSortedArray obj = new LC33_searchInRotatedSortedArray();
        System.out.println(obj.findElement(arr, target));

        sc.close();
    }
}