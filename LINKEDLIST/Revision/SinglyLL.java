package LINKEDLIST.Revision;

public class SinglyLL {
    static class Node {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++ ;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode ;
        }
        tail.next = newNode;
        tail = newNode;
        size++ ;
    }

    public void addMiddle(int data, int pos){
        Node newNode = new Node(data);

        if(head == null || pos == 0){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;

        while(i < pos - 1 && temp.next != null){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int deleteFirst(){
        if(size == 0){
            System.out.println("Linked List is empty.");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size == 0){
            System.out.println("Linked List is empty.");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while(prev.next.next != null){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int deleteMiddle(int pos){
        if(size == 0){
            System.out.println("Linked List is empty.");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else if(pos == 1){
            deleteLast();
        }else if(pos == size) {
            deleteLast();
        }else if(pos <= 0 || pos > size){
            System.out.println("Invalid position.");
            return Integer.MIN_VALUE;
        }

        Node temp = head;
        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public boolean iterativeSearch(int target){
        Node temp = head;
        
        while(temp != null && temp.data != target){
            temp = temp.next;
        }
        return temp != null;
    }

    public boolean recursiveSearch(Node head, int target){
        if(head == null) return false;
        if(head.data == target) return true;
        return recursiveSearch(head.next, target);        
    }
    public void printLL() {
        if (head == null) {
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addMiddle(3, 1);
        System.out.println(ll.recursiveSearch(ll.head, 3));
        ll.printLL();
    }
}
