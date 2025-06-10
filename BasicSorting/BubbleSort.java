package BasicSorting;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for(int j = 0; j <= n - (turn + 2); j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        
    }

    public static void bubbleSortOptimised(int[] nums) {
        int n = nums.length;
        for (int turn = 0; turn < n - 1; turn++) {
            int swaps = 0;
            for(int j = 0; j <= n - (turn + 2); j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 ,5};
        // bubbleSort(arr);
        bubbleSortOptimised(arr);
        printArray(arr);
    }
}
