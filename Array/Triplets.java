package Array;

import java.util.Arrays;

public class Triplets {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    System.out.print("( " + nums[i] + ", " + nums[left] + ", " + nums[right] + " ) ");
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
