package GREEDY;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void getMaxKnapsackValue(int[] weight, int[] value, int knapsack) {
        if (knapsack == 0) {
            System.out.println("Knapsack is empty. maximum lot: 0.0");
            return;
        }
        double[][] ratio = new double[value.length][2];
        // 0th col => idx; 1st col => ratio

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = knapsack;
        double finalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity > weight[idx]) {
                capacity -= weight[idx];
                finalValue += value[idx];
            } else {
                // include fractional item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum lot: %.2f\n" + finalValue);
    }

    public static void main(String[] args) {
        int[] weight = { 10, 20, 30 };
        int[] value = { 60, 100, 120 };
        int W = 50;
        getMaxKnapsackValue(weight, value, W);
    }
}
