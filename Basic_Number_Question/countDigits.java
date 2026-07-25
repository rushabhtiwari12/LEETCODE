package Basic_Number_Question;

import java.util.Scanner;

public class countDigits{

    public int digits(int n){
        String num = Integer.toString(n);
        return num.length();

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Integer");
        int n = sc.nextInt();
        countDigits obj = new countDigits();
        System.out.println(obj.digits(n));
        System.out.println("TC-o(d), SC-o(n)");
    }
}
