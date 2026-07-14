package ARRAYS.MEDIUM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TWO_SUM_2_Leetcode_167 {
    // Brute force approach with TC -  O(N2)
    public int[] two_sum_2_brute(int[] arr, int target){
        int n= arr.length;
        for(int i =0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{};

    }

    // Better approach. reducing TC from N2 to N 
    // TC -O(N)
    // SC -O(N)
    public int[] two_sum_2_better(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        for(int i =0; i<n; i++){
            int remaining = target - arr[i];
            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining)+1, i+1};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    // OPTIMAL APPROACH
    // TC -O(N)
    // SC - O(1) constant space complexity
    public int[] two_sum_2(int[] numbers, int target){
        int n = numbers.length;
        int i =0;
        int j = n-1;
        while(i<j){
            if(numbers[i]+numbers[j] == target){
                return new int[]{i+1,j+1};
            }else if(numbers[i]+numbers[j]>target){
                j =j-1;
            }else{
                i=i+1;
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

        TWO_SUM_2_Leetcode_167 obj = new TWO_SUM_2_Leetcode_167();
        System.out.println("The array of Indices is ");
        System.out.println(Arrays.toString(obj.two_sum_2(arr, target)));
        sc.close();
    }
}

