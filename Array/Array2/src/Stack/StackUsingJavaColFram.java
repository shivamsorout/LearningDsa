package Stack;

import java.util.Stack;

public class StackUsingJavaColFram {
    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();
        while(!stack.empty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
