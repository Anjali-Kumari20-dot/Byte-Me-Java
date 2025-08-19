package QUEUE.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectNRopesWithMinimimCost {
    public static int minCost(int[] ropes){
        Queue<Integer> q = new LinkedList<>();

        for (int rope : ropes){
            q.add(rope);
        }

        List<Integer> ropeList = new  ArrayList<>(q);
        Collections.sort(ropeList);

        int totalCost = 0;
        while(ropeList.size() > 1){
            int first = ropeList.remove(0);
            int second = ropeList.remove(0);

            int cost = first + second;
            totalCost += cost;

            ropeList.add(cost);
            Collections.sort(ropeList);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int[] ropes1 = {4, 3, 2, 6};
        System.out.println(minCost(ropes1));

        int[] ropes2 = {1, 2, 3};
        System.out.println(minCost(ropes2));
    }
}
