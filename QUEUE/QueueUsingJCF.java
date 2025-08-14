package QUEUE;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

// -> Queue is an interface 
// -> LinkedList or ArrayDequeue can implement it only

public class QueueUsingJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); // ArrayDequeue
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
