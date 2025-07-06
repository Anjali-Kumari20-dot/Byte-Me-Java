package Recursion;

public class Print_Factorial {
    public static int rec_Factorial(int n){
        if( n == 1 || n == 0) return 1;
        return n * rec_Factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(rec_Factorial(5));
    }
}
