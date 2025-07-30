package LINKEDLIST;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        public  Node(int data) {
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
    public int itrSearch(int target) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == target) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Search (Recursive)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Display
    public static void display() {

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

    // Reverse
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove nth node
    public void removeNthNodeFromEnd(int pos) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (pos == sz) {
            head = head.next; // remove first
            return;
        }
        // sz - pos
        int i = 1;
        int iToFind = sz - pos;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Find Mid Node - Slow/Fast Approach
    public Node MidNode(Node node){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Check Palindrome
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Find mid
        Node mid = MidNode(head);

        // Reverse 2nd half 
        Node prev = null;
        Node curr = mid;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Check if equal
        Node left = head;
        Node right = prev;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    // Detect loop/cycle in a LL
    public static boolean hasCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // Remove a loop/cycle in a LL
    public static void removeLoop(){
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            System.out.println("Cycle does not exists.");
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // break cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();

        // ll.addLast(11);
        // ll.addLast(12);
        // ll.addLast(13);
        // ll.addLast(12);
        // ll.addLast(11);
        
        // ll.addLast(13);
        // ll.addLast(14);
        // ll.addMiddle(2, 55);

        // System.out.print("Before : ");
        // ll.display();

        // System.out.println("Is Palindrome : " + ll.isPalindrome());

        // ll.removeNthNodeFromEnd(3);
        // System.out.print("After : ");
        // ll.display();

        // ll.reverse();
        // System.out.print("After Reverse : ");
        // ll.display();

        // System.out.println("Removed from first : " + ll.removeFirst());
        // ll.display();

        // System.out.println("Removed from last : " + ll.removeLast());
        // ll.display();

        // System.out.println("Search for 12 at position : "+ ll.itrSearch(12));
        // System.out.println("Search for 55 at position : "+ ll.itrSearch(55));

        // System.out.println("Search for 12 at position : "+ ll.recSearch(12));
        // System.out.println("Search for 55 at position : "+ ll.recSearch(55));

        // System.out.println("Size of Linked list : " + size);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node temp = new Node(4);
        head.next.next.next = temp;
        temp.next = new Node(5);
        temp.next.next = new Node(6);
        temp.next.next.next = new Node(7);
        temp.next.next.next.next = head.next;

        removeLoop();
        display();

    }
}
