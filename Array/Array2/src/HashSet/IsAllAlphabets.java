package HashSet;


import java.util.*;

public class IsAllAlphabets {
    public static boolean isAllAlphabet(String str){
        HashSet<Character> set2 = new HashSet<>();
        str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z') set2.add(str.charAt(i));
        }
//        if(set2.size()==26) return true;
        return set2.size()==26? true: false;
//        else return false;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isAllAlphabet(str));
    }
}
