package Array;

public class TrappingRainWater {

    public static int trappedRainwater(int height[]){
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] water_level = new int[n];

        // LEFT MAX BOUNDARY
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // RIGHT MAX BOUNDARY
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            water_level[i] = Math.min(leftMax[i], rightMax[i]);
            trappedWater += Math.max(0, water_level[i] - height[i]);
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int trappedWater = trappedRainwater(arr);
        System.out.println("Water trapped: " + trappedWater);
    }
}
