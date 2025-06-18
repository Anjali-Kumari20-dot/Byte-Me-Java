package patterns;

import java.util.Scanner;

public class rhombus {
    public static void solidRhombus(int n){
        for(int i = 1; i <= n; i++){
            // spaces 
            for(int spaces = 1 ; spaces <= n-i; spaces++){
                System.out.print("   ");
            }
            for(int stars = 1 ; stars <= n; stars++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("   ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // solidRhombus(n);
        hollowRhombus(n);
    }
}
