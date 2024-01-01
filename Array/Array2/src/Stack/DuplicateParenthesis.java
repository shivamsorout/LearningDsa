package Stack;

import java.util.HashSet;
import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicateParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')'){
                stack.push(str.charAt(i));
            }else{
                int count=0;
                while((stack.peek()!='(')){
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count<1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isDuplicateParenthesis("(()"));
    }
}
