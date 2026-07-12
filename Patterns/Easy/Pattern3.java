// 1 

// 1 2 

// 1 2 3 

// 1 2 3 4 

// 1 2 3 4 5 

package Patterns.Easy;
import java.util.Scanner;
public class Pattern3 {

    public static void pattern3(int n){
        for(int i =0; i<n;i++){
            for(int j =1;j<=i+1;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern3(n);
        sc.close();
    }
}
