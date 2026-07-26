package Basic_Number_Question;

import java.util.Scanner;

public class Largest_Digit_in_a_number {

    public int largestNo(int n){
        int max1 =Integer.MIN_VALUE;
        while(n!=0){
            int rem = n%10;
            if(rem>max1){
                max1=rem;
            }
            n=n/10;
        }
        return max1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        Largest_Digit_in_a_number obj = new Largest_Digit_in_a_number();
        System.out.println(obj.largestNo(n));
    }
}
