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
        ll.printLL();
        System.out.println("Size of ll : "+ size);
    }
}
