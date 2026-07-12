//     * 

//    * * * 

//   * * * * * 

//  * * * * * * * 

// * * * * * * * * * 



package Patterns.Medium;

import java.util.Scanner;

public class Pattern7 {

    public static void pattern7(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
                for(int k =1; k<2*i; k++){
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
        pattern7(n);
        sc.close();
    }
    
}
