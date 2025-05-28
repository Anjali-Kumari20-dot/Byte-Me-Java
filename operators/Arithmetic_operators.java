package operators;


import java.util.Scanner;

public class Arithmetic_operators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + (num1 / num2));
        System.out.println("modulo : " + (num1 % num2));
    }
}