package operators;


import java.util.Scanner;

public class UnaryOperators{
    public static void main(String[] args) {
        int a = 10;
        int b = a--;
        System.out.println(a);
        System.out.println(b);
        int c = ++a;
        System.out.println(c);
        System.out.println(a);
    }
}