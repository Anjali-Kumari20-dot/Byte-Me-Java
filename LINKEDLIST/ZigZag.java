package LINKEDLIST;

import java.util.LinkedList;

public class ZigZag {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    private static Node midNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node zigZag(Node head) {
        // find mid node
        Node mid = midNode(head);

        // 2nd half reverse
        Node rHead = mid.next;
        mid.next = null;
        rHead = reverse(rHead);

        // Alternate merging
        Node lHead = head;
        Node nextL, nextR;

        while (lHead != null && rHead != null) {
            // zig-zag
            nextL = lHead.next;
            nextR = rHead.next;
            lHead.next = rHead;
            rHead.next = nextL;

            // update
            lHead = nextL;
            rHead = nextR;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        for (int data : ll) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        System.out.println("Before : ");
        printList(head);

        System.out.println("After : ");
        head = zigZag(head);
        System.out.println("Zig - Zag : ");
        printList(head);
    }
}
