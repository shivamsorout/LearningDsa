package LinkedList;

public class LinkedListPalindrome {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
    }

    //Finding middle Node using slow fast technique
    public Node midOfLL(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }
    public boolean linkedListPalindrome(){
        //Corner case
        if(head==null || head.next==null){
            return true;
        }
        Node midNode = midOfLL(head);

        Node prev = null;
        Node cur = midNode;
        Node next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedListPalindrome ll = new LinkedListPalindrome();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.print();
    }
}
