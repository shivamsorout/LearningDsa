package Queue;

public class CircularQueueUsingArray {
    public static class CircularQueue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        CircularQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        //isEmty()
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //isFull
//        public static boolean isFull(){
//            if ()
//        }
    }
}
