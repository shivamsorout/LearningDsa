package LinkedList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public  static  int size;


    // Add First in Linked List
    public void addFirst(int data){
        //step1 = new Node(data)
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //Step2 = newNode next = head
        newNode.next = head; //link -> linking step
        //Step3 - head = newNode
        head = newNode;

    }

    // Add Last in Linked List
    public void addLast(int data){
        //step1 = new Node(data)
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add At Index in Linked List
    public void addOnIndex(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //Remove First
    public int removeFirst(){
        //Special Cases
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        //prev : i=size-2
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    //Print element of linked list
    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("LL Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addFirst(4);
        ll.addOnIndex(2,3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
    }
}
