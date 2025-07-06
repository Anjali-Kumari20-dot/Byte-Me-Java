package Recursion;

public class NthFibonacci {
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci number at position " + n + " is : " + fib(n));
    }
}
