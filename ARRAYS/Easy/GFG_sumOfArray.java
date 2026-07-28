package Easy;

import java.util.Scanner;

public class GFG_sumOfArray {

    public int sumArray(int[] arr){
        int n = arr.length;
        int sum1 =0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }
        return sum1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        } 
        GFG_sumOfArray obj = new  GFG_sumOfArray();
        System.out.println(obj.sumArray(arr));
    }
}
