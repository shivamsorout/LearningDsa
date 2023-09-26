import java.util.*;

public class CountDigit {
    public static boolean digitCount(String num) {

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<num.length();i++){
            int count=0;
            for(int j=0;j<num.length();j++){
                char ch = num.charAt(j);
                int charToInt = Character.getNumericValue(ch);
                if(i==charToInt) {
                    count++;
                }
            }
            list.add(count);
        }
        int point=0;
        for(int i=0;i<list.size();i++){
            char ch = num.charAt(i);
            int charToInt = Character.getNumericValue(ch);
            if(list.get(i)==charToInt){
                point++;
            }
        }
        if(point==num.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String num = "030";
        System.out.println(digitCount(num));
    }
}
