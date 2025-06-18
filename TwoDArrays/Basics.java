package TwoDArrays;

import java.util.Scanner;

public class Basics {
    public static void input(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Found at index ( " + i + ", " + j + " )");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static int smallestElement(int matrix[][]){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minValue = Math.min(minValue, matrix[i][j]);
            }
        }
        return minValue;
    }

    public static int largestElement(int matrix[][]){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxValue = Math.max(maxValue, matrix[i][j]);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        System.out.println("Input: ");
        input(matrix);
        System.out.println("Output: ");
        output(matrix);
        System.out.println("Searching: ");
        search(matrix, 8);
        System.out.print("Minimum element : ");
        System.out.println(smallestElement(matrix));;
        System.out.print("Maximum element : ");
        System.out.println(largestElement(matrix));;
    }
}
