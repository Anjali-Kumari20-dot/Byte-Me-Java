package GREEDY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static int totalCoins(Integer[] coins, int Amount) {
        Arrays.sort(coins, Comparator.reverseOrder());

        int n = coins.length;
        int countOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (coins[i] <= Amount) {
                while (coins[i] <= Amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    Amount -= coins[i];
                }
            }
        }

        System.out.print("\nCoins : ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        return countOfCoins;
    }

    public static void main(String[] args) {
        Integer coins[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int Amount = 1;
        int result = totalCoins(coins, Amount);
        System.out.println("\nTotal (min) coins used: " + result);
    }
}
