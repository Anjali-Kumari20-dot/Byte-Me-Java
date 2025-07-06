package Recursion;

public class Print_in_DecOrder {
    public static void recursion_print_decreasing(int n){
        if(n == 0) return ;
        System.out.print(n + " ");
        recursion_print_decreasing(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        recursion_print_decreasing(n);
    }
}
