package Stack;

import java.util.*;

public class StockSpanProblem {
    public static int[] stockSpan(int []stock, int[] span){
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);
        for(int i=1;i< stock.length;i++){
            int currPrice = stock[i];
            while (!stack.isEmpty() && currPrice>=stock[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
            }else {
                int prevHigh = stack.peek();
                span[i] = i-prevHigh;
            }
            stack.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int[] stock = {100,80,60,70,60,85,100};
        int[] span = new int[stock.length];
        for(int i:stockSpan(stock,span)){
            System.out.println(i);
        }
    }
}
