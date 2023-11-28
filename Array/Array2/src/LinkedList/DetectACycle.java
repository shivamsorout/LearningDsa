package LinkedList;

public class DetectACycle {
    public class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean hasCycle(ListNode head) { //Floyd's Cycle Finding Algorithm
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow==fast){ //has cycle
                return true;
            }
        }
        return false;
    }
}
