package LINKEDLIST;

public class DoublyLL {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    // Add data in first of Double LL
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add data in last of Double LL
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        } else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
   
    // Remove data from first
    public void removeFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Remove data from last
    public void removeLast(){
        if(head == null){
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Print
    public void printLL() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null \n");
    }

    // Reverse Doubly LL
    public void reverse(){
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);

        System.out.println("Original LL : ");
        ll.printLL();

        System.out.println("Reversed LL : ");
        ll.reverse();
        ll.printLL();


        // System.out.println("Remove data from first : ");
        // ll.removeFirst();
        // ll.printLL();

        // System.out.println("Remove data from last : ");
        // ll.removeLast();
        // ll.printLL();
    }
}
