// * * * * * 

// * * * * 

// * * * 

// * * 

// * 


package Patterns.Easy;

import java.util.Scanner;

public class Pattern5 {

    public static void pattern5(int n){
        for(int i =0; i<n;i++){
            
            for(int k =0; k<n-i;k++){
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern5(n);
        sc.close();
    }
}
