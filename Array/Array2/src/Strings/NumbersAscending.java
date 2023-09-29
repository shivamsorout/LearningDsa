package Strings;

import java.util.*;

public class NumbersAscending {
    public static boolean areNumbersAscending(String s) {
        String []str = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            char ch = str[i].charAt(0);
            int n = Character.getNumericValue(ch);
            System.out.println(n);
            if(n>=0){
                list.add(n);
            }
        }
        int first = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println("value : "+Character.getNumericValue('b'));
        System.out.println(areNumbersAscending(string));
    }
}
