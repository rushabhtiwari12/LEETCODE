// 1 2 3 4 5 

// 1 2 3 4 

// 1 2 3 

// 1 2 

// 1 


package Patterns.Easy;

import java.util.Scanner;

public class Pattern6 {

    public static void pattern6(int n){
        for(int i =0; i<n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println();
        }
    } 

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern6(n);
        sc.close();
    }
}
