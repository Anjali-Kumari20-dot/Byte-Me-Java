package BasicSorting;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        selectionSort(arr);
        printArray(arr);
    }
}
