package LINKEDLIST;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add first - O(1)
    public void addFirst(int data) {
        // Step1 = create new Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 - newNode next =head;
        newNode.next = head;

        // step3 : head = newNode
        head = newNode;
    }

    // Add Last - O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add Middle - O(n)
    public void addMiddle(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        size++;

        if (idx == 0) {
            addFirst(data);
            return;
        }
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(13);
        ll.addLast(14);
        ll.addMiddle(2, 55);

        ll.display();
        System.out.println("Size of Linked list : " + size);
    }
}
