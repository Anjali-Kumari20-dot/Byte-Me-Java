package BasicSorting;

public class InsertionSort {
    public static void insertionSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int prev = i - 1;
            // finding the correct position
            while(prev >= 0 && nums[prev] > curr){
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // insertion
            nums[prev + 1] = curr;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        insertionSort(arr);
        printArray(arr);
    }
}
