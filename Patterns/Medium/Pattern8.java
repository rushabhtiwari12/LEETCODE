
//  * * * * * 

//   * * * * 

//    * * * 

//     * * 

//      * 


package Patterns.Medium;
import java.util.Scanner;

public class Pattern8 {

    public static void pattern8(int n){
        for(int i = 0; i<n; i++){
            for(int j =0;j<1*i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<(2*(n-i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern8(n);
        sc.close();

    }
}
