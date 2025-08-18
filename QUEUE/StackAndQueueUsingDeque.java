package QUEUE;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackAndQueueUsingDeque {
    public static class StackUsingDeque {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static class QueueUsingDeque {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        // StackUsingDeque s = new StackUsingDeque();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("peek : "+ s.peek());
        // System.out.println(s.pop());

        QueueUsingDeque s = new QueueUsingDeque();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("peek : "+ s.peek());
        System.out.println(s.remove());
    }
}
