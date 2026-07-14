package ARRAYS.MEDIUM;
import java.util.Scanner;

    class Maximum_Product_Subarray{
        // Brute force approach 
        // TC-0(N3) n - for 1st loop , 2nd for j loop and 3rd loop for k
        // SC -O(1)  not taking any extra space
    // public int max_product(int[] arr){
    //     int max1 =Integer.MIN_VALUE;
    //     int n = arr.length;
    //     if(n==1){
    //         return n;
    //     }
    //     for(int i =0; i<n;i++){
    //         for(int j =i; j<n;j++){
    //             int product = 1;
    //             for(int k =i; k<=j;k++){
    //                 product *= arr[k];
    //             }
    //             max1 = Math.max(max1, product);
    //         }
    //     }
    //     return max1;

    // }
    public int max_product(int[] arr){
         int max1 =Integer.MIN_VALUE;
        int n = arr.length;
        if(n==1){
            return n;
         }
         for(int i =0; i<n;i++){
            int product = 1;
             for(int j =i; j<n;j++){
                product *= arr[j];
                max1 = Math.max(max1, Math.max(max1, product));
             }
    }
    return max1;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        };

        Maximum_Product_Subarray obj = new Maximum_Product_Subarray();
        System.out.println("The biggest product of subarray is ");
        System.out.println(obj.max_product(arr));
            sc.close();
    }
}