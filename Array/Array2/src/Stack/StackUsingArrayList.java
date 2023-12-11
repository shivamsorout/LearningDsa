package Stack;

import java.util.*;

public class StackUsingArrayList {
    static class StackImpl{
        static List<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        StackImpl s = new StackImpl();
        s.push(10);
        s.push(12);
        s.push(14);
        s.push(16);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
