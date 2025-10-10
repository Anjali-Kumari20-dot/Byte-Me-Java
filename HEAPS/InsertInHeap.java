package HEAPS;

import java.util.ArrayList;

public class InsertInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // par is parent index

            // Bubble up to maintain min-heap property
            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Update indices to continue bubbling up
                x = par;
                par = (x - 1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i){ //TC - O(logn)
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

        public int remove() {
            int data = arr.get(0);

            // Step 1 - Swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 - Delete last
            arr.remove(arr.size() - 1);

            // Step 3 - Heapify
            heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) { // Heap sort - (nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
