package Array;

import java.util.Scanner;

public class PairsInArray {
    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
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
        System.out.println("The pairs are : ");
        pairs(arr);
        sc.close();
    }
}
