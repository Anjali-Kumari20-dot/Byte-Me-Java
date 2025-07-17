package LeetCode.UniquePaths;

public class Solution {
    public int UniquePaths(int m, int n){
        int N = m + n - 2;
        int K = Math.min(m - 1, n - 1);

        long[] row = new long[K + 1];
        row[0] = 1;

        for(int i = 1; i <= N; i++){
            for(int j = Math.min(i, K); j > 0; j--){
                row[j] += row[j - 1];
            }
        }
        return (int) row[K];

    }
    public static void main(String[] args) {
        int m = 3, n = 7;
        Solution sol = new Solution();
        System.out.println(sol.UniquePaths(m, n));
    }
}
