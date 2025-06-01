package patterns;

import java.util.Scanner;

/* 
   *             *
   * *         * *
   * * *     * * *
   * * * * * * * * 
   * * * * * * * *
   * * *     * * *
   * *         * *
   *             *
 */

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // UPWARDS
        for (int i = 0; i < n; i++) {
            for (int stars = 0; stars <= i; stars++) {
                System.out.print(" * ");
            }
            for (int spaceLeft = n - 1; spaceLeft > i; spaceLeft--) {
                System.out.print("   ");
            }
            for (int spaceRight = i + n; spaceRight < 2 * n; spaceRight++) {
                System.out.print("   ");
            }
            for (int stars = 0; stars <= i; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // DOWNWARDS
        for (int i = n - 1; i >= 0; i--) {
            for (int stars = 0; stars <= i; stars++) {
                System.out.print(" * ");
            }
            for (int spaceLeft = n - 1; spaceLeft > i; spaceLeft--) {
                System.out.print("   ");
            }
            for (int spaceRight = i + n; spaceRight < 2 * n; spaceRight++) {
                System.out.print("   ");
            }
            for (int stars = 0; stars <= i; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
