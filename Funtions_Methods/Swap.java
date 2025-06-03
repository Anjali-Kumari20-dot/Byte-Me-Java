package Funtions_Methods;

public class Swap{
    public static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+ a);
        System.out.println("b : "+b);
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 34;

        swapNumbers(num1, num2);
    }
}