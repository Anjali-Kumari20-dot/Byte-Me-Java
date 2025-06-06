package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int arr[], int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index : " + i);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements you want to give : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Number you want to search : ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        linearSearch(arr, target);

        sc.close();
    }
}
