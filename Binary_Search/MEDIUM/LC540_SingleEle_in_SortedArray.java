import java.util.Scanner;

public class LC540_SingleEle_in_SortedArray {
    public int singleElement(int[] nums){
        int n = nums.length;
        int l =0; 
        int r = n-1;
        if(n==1){
            return nums[0];
        }
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid==0){
                if(nums[0] != nums[1]){
                    return nums[0];
                }
            }

            if(mid==n-1){
                if(nums[n-1]!=nums[n-2]){
                    return nums[n-1];
                }
            }
             if(mid>0 && mid<n-1 && nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                 return nums[mid];
             }
            else if(mid<n-1 && nums[mid]==nums[mid+1]){
                if(mid%2==0){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }else if(mid>0 && nums[mid]==nums[mid-1]){
                if(mid%2==0){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }            
        }
        return -1;
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
        LC540_SingleEle_in_SortedArray obj  = new LC540_SingleEle_in_SortedArray();
        System.out.println("The minimum element in a rotated sorted array");
        System.out.println(obj.singleElement(arr));

        sc.close();
    }
}
