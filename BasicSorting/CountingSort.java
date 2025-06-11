package BasicSorting;

public class CountingSort {
    public static void countingSortNonNegative(int[] nums) {
        if(nums.length == 0) return;

        // finding range
        int largest = nums[0];
        for (int num : nums) {
            largest = Math.max(largest, num);
        }

        int count[] = new int[largest + 1];

        // Populate the count array while finding the largest element
        for (int num : nums) {
            count[num]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j++] = i;
                count[i]--;
            }
        }
    }
    public static void CountingSortOptimized(int[] nums){
        if(nums.length == 0) return; //edge case : empty array

        // find min and max value
        int min = nums[0], max = nums[0];
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int range = max - min + 1;
        int[] count = new int[range];

        // populate the count array
        for(int num : nums){
            count[num - min]++;  // shift index to handle negatives
        }

        // sorting
        int j = 0;
        for(int i = 0; i < count.length;i++){
            while(count[i] > 0){
                nums[j++] = i + min; //shift back to original values
                count[i]--;
            }
        }
    } 
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -1, -4, 1, -3, 2, -4, -7 };
        CountingSortOptimized(arr);
        printArray(arr);
    }
}
