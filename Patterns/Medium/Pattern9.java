package Patterns.Medium;

import java.util.Scanner;

public class Pattern9 {

    public static void pattern9(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<(2*(n-i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern9(n);
        sc.close();
}
}
