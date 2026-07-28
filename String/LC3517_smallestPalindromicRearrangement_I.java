package String;

import java.util.Arrays;
import java.util.Scanner;

public class LC3517_smallestPalindromicRearrangement_I {

    public String smallestPalString(String s){
        int n = s.length();
        if(n==1) return s;
        int mid = n/2;
        char [] ch = s.toCharArray();
        Arrays.sort(ch, 0,mid);
        for(int i =0;i<mid;i++){
            ch[n-i-1] = ch[i];
        }
        String s1  = new String(ch);
        return s1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        LC3517_smallestPalindromicRearrangement_I obj = new LC3517_smallestPalindromicRearrangement_I();
        System.out.println(obj.smallestPalString(s));
    }
}
