package Sorting;

import java.util.*;

public class SplitWordBySeparator {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for (int i=0;i< words.size();i++) {
            String str = "";
            for (int j=0;j<words.get(i).length();j++) {
                if(words.get(i).charAt(j)!=separator){
                    str += String.valueOf(words.get(i).charAt(j));
                    if(j==words.get(i).length()-1){
                        list.add(str);
                    }
                }else {
                    if(str.length()>=1){
                        list.add(str);
                        str = "";
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("###x#i@f");
        List<String> newStr = splitWordsBySeparator(str,'#');
        for(String st:newStr){
            System.out.println(st);
        }
    }
}
