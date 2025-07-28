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

    // Remove first - O(1)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search(iterative)
    public int Search(int target){
        Node temp = head;
        int i = 0;
        
        while(temp != null){
            if(temp.data == target){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
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

        // System.out.print("Before Removal LL : ");
        ll.display();

        // System.out.println("Removed from first : " + ll.removeFirst());
        // ll.display();

        // System.out.println("Removed from last : " + ll.removeLast());
        // ll.display();

        System.out.println("Search for 12 at position : "+ ll.Search(12));
        System.out.println("Search for 55 at position : "+ ll.Search(55));

        // System.out.println("Size of Linked list : " + size);

    }
}
