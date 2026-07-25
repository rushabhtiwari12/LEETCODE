
package Patterns.Medium;

import java.util.Scanner;

public class Pattern11 {

    public static void pattern11(int n){
        for(int i =1; i<n;i++){
            int start =1;
            if(i%2==0) start =0;
            for(int k =1; k<i+1;k++){
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern11(n);
        sc.close();
    }
}
