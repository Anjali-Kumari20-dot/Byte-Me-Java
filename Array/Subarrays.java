package Array;

import java.util.Scanner;

public class Subarrays {
    public static void printSubarrays(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("[ ");
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.print("] ");
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
        System.out.println("The subarrays are : ");
        printSubarrays(arr);
        sc.close();
    }
}
