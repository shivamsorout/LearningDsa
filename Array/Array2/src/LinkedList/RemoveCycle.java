package LinkedList;

public class RemoveCycle {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static  Node tail;
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Detect the cycle
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) { // has cycle
                cycle = true;
                break;
            }
        }

        // If no cycle, return
        if (!cycle) {
            return;
        }

        // Case: Loop connected to the head
        if (head == slow) {
            while (fast.next != head) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // Case: Loop connected to a node other than the head
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    public static void main(String[] args) {

    }
}
