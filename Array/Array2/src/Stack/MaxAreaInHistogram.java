package Stack;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static int maxAreaInHistogram(int [] rectangle){
        int[] nextSmallerRight = nextSmallerRight(rectangle);
        int[] nextSmallerLeft = nextSmallerLeft(rectangle);
        int maxArea = Integer.MIN_VALUE;
        for(int i=1;i<rectangle.length;i++){
            int height = rectangle[i];
            int width = nextSmallerRight[i]-nextSmallerLeft[i]-1;
            int area = width*height;
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }

    private static int[] nextSmallerLeft(int[] rectangle) {
        Stack<Integer> stack = new Stack<>();
        int[] nextSmaller = new  int[rectangle.length];
        for(int i=0;i<rectangle.length;i++){
            while(!stack.isEmpty() && rectangle[stack.peek()]>=rectangle[i]){
                stack.pop();
            }
            if(stack.isEmpty()) nextSmaller[i] = -1;
            else nextSmaller[i] = stack.peek();
            stack.push(i);
        }
        return nextSmaller;
    }

    private static int[] nextSmallerRight(int[] rectangle) {
        Stack<Integer> stack = new Stack<>();
        int[] nextSmaller = new  int[rectangle.length];
        for(int i=rectangle.length-1;i>=0;i--){
            while(!stack.isEmpty() && rectangle[stack.peek()]>=rectangle[i]){
                stack.pop();
            }
            if(stack.isEmpty()) nextSmaller[i] = rectangle.length;
            else nextSmaller[i] = stack.peek();
            stack.push(i);
        }
        return nextSmaller;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        System.out.println(maxAreaInHistogram(arr));
    }
}
