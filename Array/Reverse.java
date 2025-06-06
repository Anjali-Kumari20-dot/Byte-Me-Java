package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements you want to give : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Original Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.print("Reversed array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
