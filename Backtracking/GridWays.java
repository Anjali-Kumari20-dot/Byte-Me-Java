package Backtracking;

public class GridWays {
    public static int optimisedGridWays(int n, int m){
        return factorial(n + m -2)/(factorial(n - 1) * factorial(m - 1));
    }
    public static int factorial(int n){
        int res = 1;
        for (int i  = 2; i <= n ; i++){
            res *= i;
        }
        return res;
    }
    public static int gridWays(int i , int j, int n, int m){
        // base case
        if(i == n - 1 && j == m - 1){ 
            return 1;
        }else if (i == n || j == m){
            return 0;
        }

        // right
        int w1 = gridWays(i + 1, j, n, m);
        // down 
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 4, m = 5;
        // int ways = gridWays(0, 0, n, m);
        // System.out.println(ways);
        System.out.println(optimisedGridWays(n, m) );
    }
}