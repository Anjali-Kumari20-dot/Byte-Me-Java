package GREEDY;

import java.util.*;

public class MaximumLengthChainOfPairs {
    public static int maxLength(int pairs[][]) {
        List<int[]> validPairs = new ArrayList<>();
        for(int[] pair : pairs){
            if(pair[0] < pair[1]){
                validPairs.add(pair);
            }
        }
        pairs = validPairs.toArray(new int[0][]);
        if (pairs.length == 0)
            return 0;

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        return chainLength;
    }

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        int res = maxLength(pairs);
        System.out.println("Maximum length of Chain: " + res);

        // Empty input
        System.out.println("\nTest case: Empty input ");
        int pairs2[][] = {};
        int res2 = maxLength(pairs2);
        System.out.println("Maximum length of Chain: " + res2);

        // Single Pair
        System.out.println("\nTest case: Single Pair ");
        int pairs3[][] = { { 1, 2 } };
        int res3 = maxLength(pairs3);
        System.out.println("Maximum length of Chain: " + res3);

        // All pairs overlapping
        System.out.println("\nTest case: All pairs overlapping ");
        int pairs4[][] = { { 1, 10 }, { 2, 9 }, { 3, 8 } };
        int res4 = maxLength(pairs4);
        System.out.println("Maximum length of Chain: " + res4);

        // All pairs Non-overlapping
        System.out.println("\nTest case: All pairs Non-overlapping ");
        int pairs5[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int res5 = maxLength(pairs5);
        System.out.println("Maximum length of Chain: " + res5);

        // Pairs with Same End Time
        System.out.println("\nTest case: Pairs with Same End Time ");
        int pairs6[][] = { { 1, 5 }, { 2, 5 }, { 3, 5 } };
        int res6 = maxLength(pairs6);
        System.out.println("Maximum length of Chain: " + res6);

        // Pairs with Same Start Time
        System.out.println("\nTest case: Pairs with Same Start Time ");
        int pairs7[][] = { { 1, 2 }, { 1, 3 }, { 1, 4 } };
        int res7 = maxLength(pairs7);
        System.out.println("Maximum length of Chain: " + res7);

        // Negative numbers
        System.out.println("\nTest case: Negative numbers ");
        int pairs8[][] = { { -10, -5 }, { -4, 0 }, { 1, 5 } };
        int res8 = maxLength(pairs8);
        System.out.println("Maximum length of Chain: " + res8);

        // Start > End in a pair
        System.out.println("\nTest case: Start > End in a pair ");
        int pairs9[][] = {{5, 2}, {1, 3}};
        int res9 = maxLength(pairs9);
        System.out.println("Maximum length of Chain: " + res9);

        // Large Input Size
        System.out.println("\nTest case: Large Input Size");
        int pairs10[][] = new int[100000][2]; // Random valid pairs
        for(int i = 0; i < 100000; i++){
            pairs10[i][0] = i * 10;      // start
            pairs10[i][1] = i * 10 + 5;  //end
        }
        int res10 = maxLength(pairs10);
        System.out.println("Maximum length of Chain: " + res10);

    }
}
