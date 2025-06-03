package Funtions_Methods;

public class Product {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println(multiply(23, 789));
    }
}