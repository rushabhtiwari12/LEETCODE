package MEDIUM;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class LC15_3SUM{

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        int l =nums.length;
        if(l<3){
            return list;
        }
        for(int i=0; i<l-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int n = nums[i];
            int target = -n;

        int j = i+1;
        int k =l-1;
        while(j<k){
            int sum = nums[j]+nums[k];
            if(sum>target) k--;
            else if(sum<target) j++;
            else if(sum == target){
                list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]){
                    j++;
                }
                while(j<k && nums[k] == nums[k+1]){
                    k--;
                }

            }
        }
        }
        return  list;
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0;  i<n;i++){
            arr[i] = sc.nextInt();
        }
        LC15_3SUM obj = new  LC15_3SUM();
        System.out.println(obj.threeSum(arr));
    }
}