package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseStringUsingStack(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            char ch = stack.pop();
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStringUsingStack("abc"));
    }
}
