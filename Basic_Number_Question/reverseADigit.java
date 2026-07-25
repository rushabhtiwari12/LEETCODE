package Basic_Number_Question;

import java.util.Scanner;

public class reverseADigit {

    public int reverseDigit(int n){
        int num =0;
        while(n!=0){
            int rem = n%10;
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && rem>7)){
                return 0;
            }else if(num<Integer.MIN_VALUE || (num==Integer.MIN_VALUE/10 && rem<-8)){
                return 0;
            }

            num = num*10 + rem;
            n=n/10;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseADigit obj = new reverseADigit();
        System.out.println(obj.reverseDigit(n));
    }
    
}
