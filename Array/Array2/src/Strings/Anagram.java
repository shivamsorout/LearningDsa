package Strings;

import java.util.*;

public class Anagram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = p.length();
        for(int i=0;i<s.length()-(n-1);i++){
            if(isAnagram(s,p,i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isAnagram(String s, String p, int a){
        int n=p.length();
        char[] arr1 = new char[n];
        char[] arr2 = p.toCharArray();
        Arrays.sort(arr2);
        int x=0;
        for(int i=a;i<n+a;i++){
            arr1[x] = s.charAt(i);
            x++;
        }
        Arrays.sort(arr1);
        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        for(int i:findAnagrams(s,p)){
            System.out.println(i);
        }
    }
}
