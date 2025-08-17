package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveTwohalvesOfQueue {
    public static Queue<Integer> interLeave(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> first = new LinkedList<>();

        int i = 0;
        if (size % 2 == 0) {
            while (i < size / 2) {
                first.add(q.remove());
                i++;
            }
        } else {
            while (i < (size + 1) / 2) {
                first.add(q.remove());
                i++;
            }
        }

        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        // q.add(10);
        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " "); // output : 1 6 2 7 3 8 4 9 5 10
            q.remove();
        }
    }
}
