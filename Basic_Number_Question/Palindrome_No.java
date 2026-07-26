package Basic_Number_Question;

import java.util.Scanner;

public class Palindrome_No {
    public boolean palindronme(int n){
        int num =0;
        int n1 = n;
        while(n1!=0){
            if(n1<0){
                n1 = -(n1);
            }
            int rem = n1%10;
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && rem>7)){
                return false;
            } //reson to find only max overflow is that i am considering the n as 32 bit unsigned integer.
            
            num = num*10 + rem;
            n1 = n1/10;
        }
        return num == n;
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No");
        int n = sc.nextInt();
        Palindrome_No obj = new Palindrome_No();
        System.out.println(obj.palindronme(n));
    }
}
