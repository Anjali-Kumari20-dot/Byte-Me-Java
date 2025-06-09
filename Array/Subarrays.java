package Array;

import java.util.*;

public class Subarrays {
    public static void printSubarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }

    // BRUTE FORCE
    public static int subarraySumI(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    // PREFIX SUM
    public static int subarraySumII(int arr[]) {
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    // KADANE'S ALGORITHM
    public static int kadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0){
                currSum = 0;
            }   
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements you want to give : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("The subarrays are : ");
        // printSubarrays(arr);
        int maxSum = kadane(arr);
        System.out.println(maxSum);
        sc.close();
    }
}
