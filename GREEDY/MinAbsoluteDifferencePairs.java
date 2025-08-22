package GREEDY;

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    public static void minAbsDiff(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = 0;

        for (int i = 0; i < arr1.length; i++) {
            minDiff += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println("Minimum Absolute Difference Pairs: " + minDiff);
    }

    public static void main(String[] args) {
        int[] A = { 4, 1, 8, 7 };
        int[] B = { 2, 3, 6, 5 };

        minAbsDiff(A, B);
    }
}
