package LeetCode.FindSubsets;

import java.util.*;
// Bactracking
public class Solution {
    public List<List<Integer>> subsets(int nums[]){
        List<List<Integer>> result = new ArrayList<>();

        backTrack(nums, 0, result, new ArrayList<>());
        return result;
    }
    private void backTrack(int nums[], int i, List<List<Integer>> result, List<Integer> current){
        if(i == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        backTrack(nums, i + 1, result, current);

        current.remove(current.size() - 1); // backtrack
        backTrack(nums, i + 1, result, current);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = sol.subsets(nums);
        System.out.println(subsets);
    }
}
