package Basic_Number_Question;

import java.util.Scanner;

public class LC9_palindromeNo_OptimalArroach {
    public boolean palindromeOptimal(int n){
        int reversedHalf = 0;

        if(n<0 || (n/10 ==0 && n!=0)){
            return false;
        }
        while(n>reversedHalf){
            int rem = n%10;
            reversedHalf = reversedHalf*10 +rem;
            n=n/10;
        }
        if(n==reversedHalf || n == reversedHalf/10){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No");
        int n = sc.nextInt();
        LC9_palindromeNo_OptimalArroach obj = new LC9_palindromeNo_OptimalArroach();
        System.out.println(obj.palindromeOptimal(n));
    }
}
