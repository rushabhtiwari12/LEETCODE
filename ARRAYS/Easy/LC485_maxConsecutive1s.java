package Easy;

import java.util.Scanner;

public class LC485_maxConsecutive1s {
    public int maxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int count =0;
        int max1 =0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                count+=1;
                max1 = Math.max(max1,count);
            }else{
                count =0;
            }
        }
        return max1;
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
        LC485_maxConsecutive1s obj = new LC485_maxConsecutive1s();
        System.out.println(obj.maxConsecutiveOnes(arr));
}
}
