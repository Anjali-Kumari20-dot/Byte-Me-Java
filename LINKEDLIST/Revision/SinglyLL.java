package LINKEDLIST.Revision;

public class SinglyLL {
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode = head = tail;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLL(){
        Node temp = head;

        if(head == null){
            return;
        }

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.addFirst(1);
        ll.printLL();
    }
}
