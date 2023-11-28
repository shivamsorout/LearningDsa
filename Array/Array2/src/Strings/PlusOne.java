package Strings;

import java.util.*;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int sum = 0;
        for(int i=0;i<digits.length;i++){
            sum = sum*10 + digits[i];
        }
        String str = Integer.toString(sum+1);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(Character.getNumericValue(str.charAt(i)));
        }
        int result[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
//        for(int i:plusOne(arr)){
//            System.out.println(i);
//        }
        System.out.println(1010 | 1);
    }
}
