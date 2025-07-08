package Recursion;

public class TillingProblem {
    public static int tillingProblem(int n){ // Leetcode 790
        // base case
        if( n == 0 || n == 1){
            return 1;
        }
        //  work
        // vertical
        int fnm1 = tillingProblem(n - 1);
        // horizontal
        int fnm2 = tillingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
    }
}
