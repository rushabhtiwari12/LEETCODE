// 1
// 22
// 333
// 4444
// 55555

package Patterns.Easy;

import java.util.Scanner;

public class Pattern4 {
    public static void pattern4(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the pattern you want to get printed");
        int n=sc.nextInt();
        pattern4(n);
        sc.close();
    }
    
}
