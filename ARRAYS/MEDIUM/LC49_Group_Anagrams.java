package ARRAYS.MEDIUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LC49_Group_Anagrams {
    public List<List<String>> anagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
         return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        String[] strs = new String[n];
        for(int i =0; i<n;i++){
            strs[i] = sc.next();  
        }

        LC49_Group_Anagrams obj = new LC49_Group_Anagrams();
        System.out.println(obj.anagrams(strs));
    }
}
