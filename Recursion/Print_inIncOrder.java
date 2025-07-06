package Recursion;

public class Print_inIncOrder {
    public static void recursion_print_increasing(int n){
        if(n == 0) return;
        recursion_print_increasing(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        recursion_print_increasing(n);
    }
}
