package ARRAYS.MEDIUM;
import java.util.*;
public class GFG_Factorial_Large_Number {

    public  ArrayList<Integer> factorialLargeNo(int n){
        ArrayList<Integer> list = new ArrayList<>(); 
        int carry =0;
        list.add(1);
        for(int i=2;i<=n;i++){
            for(int j  =0;j<list.size();j++){
                int res = (list.get(j)*i) + carry;
                carry = res/10;
                list.set(j, res%10);
            }
            while(carry != 0){
                list.add(carry%10);
                carry = carry/10;
            }
        }
        Collections.reverse(list);
        return list;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for factorial");
        int n  = sc.nextInt();

        GFG_Factorial_Large_Number obj = new GFG_Factorial_Large_Number();
        System.out.println(obj.factorialLargeNo(n));

        sc.close();
        
    }
}
