package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stack.push(str.charAt(i));
            } else {
                //if there is no opening tag
                if(stack.isEmpty()) return false;

                if((str.charAt(i)=='}' && stack.peek()=='{') || //{}
                        (str.charAt(i)==')' && stack.peek()=='(') || //()
                        (str.charAt(i)==']' && stack.peek()=='[')){ //[]
                    stack.pop();
                }else return false;
            }
        }
        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        String str = "[[{()}]()]";
        System.out.println(isValidParenthesis(str));
    }
}
