package HashMap;

import java.util.HashMap;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String str){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        int countParantehesis = 0;
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                countParantehesis++;
            } else if (map.containsValue(ch)) {
                if(countParantehesis == 0) return false;
                countParantehesis--;
            }
        }
        return countParantehesis==0?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isValidParenthesis("{()()}"));
    }
}
