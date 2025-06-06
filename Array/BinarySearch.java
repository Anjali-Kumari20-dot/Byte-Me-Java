package Array;

import java.util.*;

public class BinarySearch {
    public static void binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents overflow
            if (arr[mid] == key) {
                System.out.println("Found");
                found = true;
                break;
            } else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (!found)
            System.out.println("Not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements you want to give : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the Number you want to search : ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // Ensure the array is sorted before searching
        binarySearch(arr, key);

        sc.close();
    }
}
