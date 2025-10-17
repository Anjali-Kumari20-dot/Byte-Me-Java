package HEAPS;

import java.util.PriorityQueue;

public class TaskSchedular {
    static class Task implements Comparable<Task>{
        String name;
        int deadline;
        int priority;

        public Task(String name, int deadline, int priority){
            this.name = name;
            this.deadline = deadline;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task t2){
            return this.deadline - t2.deadline;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(new Task("Code", 4, 2));
        pq.add(new Task("Post", 2, 1));
        pq.add(new Task("NIMCET", 1, 3));
        pq.add(new Task("Assignments", 3, 2));
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().deadline + " -> " + pq.peek().priority);
            pq.remove();
        }
    }
}
