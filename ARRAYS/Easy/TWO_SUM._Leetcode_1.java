package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class TWO_SUM_2_Leetcode_1{
    // Brute Force Approach
    // The Time Complexity here is O(n2) due to two for loops and SC is still O(1)
    public int[] two_sum_brute(int[] arr, int target){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }



    // OPTIMAL
    // The more Optimal approach with TC of O(N)
    public int[] two_sum(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> nums = new HashMap<>();
        for(int i =0; i<n; i++){
            int remaining = target - arr[i];
            if(nums.containsKey(remaining)){
                return new int[]{nums.get(remaining), i};
            }else{
                nums.put(arr[i], i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] aregs){
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

        TWO_SUM_2_Leetcode_1 obj = new TWO_SUM_2_Leetcode_1();
        System.out.println("The array of Indices is ");
        System.out.println(Arrays.toString(obj.two_sum(arr, target)));
        sc.close();
    }
}