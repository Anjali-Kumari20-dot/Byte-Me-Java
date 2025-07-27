package LINKEDLIST;

public class LinkedList {
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

    // Add first - O(1)
    public void addFirst(int data){
        // Step1 = create new Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2 - newNode next =head;
        newNode.next = head;

        // step3 : head = newNode
        head = newNode;
    }

    // Add Last - O(1)
    public void addLast(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode ;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(13);
        ll.addLast(14);
    }
}
