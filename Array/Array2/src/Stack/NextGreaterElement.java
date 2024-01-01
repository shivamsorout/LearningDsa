package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int [] nextGreater = new int[arr.length];
        //reverse iterate
        for(int i= arr.length-1;i>=0;i--){
            //while condition
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            //if-else condition
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[stack.peek()];
            }
            //push element
            stack.push(i);
        }
        return nextGreater;
    }

    public static void main(String[] args) {
//        int[] arr =  {3,1,2,4,5};
        int[] arr =  {6,8,0,1,3};
        for(int i:nextGreaterElement(arr)){
            System.out.println(i);
        }
    }
}
