package Easy;

import java.util.Scanner;

public class LC1464_maximumProductOfTwoElementsInAnArray {

    public int bruteMaxProduct(int[] arr){

        int n = arr.length;
        int maxProduct1=0;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                int product  = (arr[i]-1)*(arr[j]-1);
                if(product>maxProduct1){
                    maxProduct1 = product;
                }
            }
        }
        return maxProduct1;
    }

    public int optimalMaxProduct(int[] arr){
        int n = arr.length;
        // int maxProduct =0;
        int largestValue =0;
        int secondLargest = 0;
        for(int i =0;i<n;i++){
            if(arr[i]>largestValue){
                secondLargest = largestValue;
                largestValue = arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest = arr[i];
            } 
        }
        int n1 = (largestValue-1)*(secondLargest-1);
        return n1;
    }
    public static void main(String[] aregs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        LC1464_maximumProductOfTwoElementsInAnArray obj = new LC1464_maximumProductOfTwoElementsInAnArray();
        System.out.println(obj.optimalMaxProduct(arr));
}}
