package BasicSorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 3, 1, 2 };
        // Sorting the first three elements (indices 0 to 2) in natural order
        Arrays.sort(arr, 0, 3);
        printArray(arr);
        // Sorting the entire array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
