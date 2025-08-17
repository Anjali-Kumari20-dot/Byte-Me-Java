package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while(!s.empty()){
            q.add(s.pop());
        }
    }
    public static void reverseFirstK(Queue<Integer> q, int k){
        int size = q.size();
        Stack<Integer> s = new Stack<>();
        // step 1: push in stack upto k elements
        for(int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        // step 2: add to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        // step 3: reverse the rest elements
        for(int i = 0; i < size - k; i++){
            q.add(q.remove());
        }

        while(!s.empty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // reverseQ(q);
        // while(!q.isEmpty()){
        //     System.out.print(q.peek() + " ");
        //     q.remove();
        // }
        reverseFirstK(q, 3);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " "); // output : 3 2 1 4 5 
            q.remove();
        }
    }
}
