package operators;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 34;
        int b = 36;
        if (a == b) {
            System.out.println(a + " == " + b);
        } else if (a > b) {
            System.out.println(a + " != " + b + " and " + a + " > " + b);
        } else if (a < b) {
            System.out.println(+a + " != " + b + " and " + a + " < " + b);
        } else if (a <= b) {
            System.out.println(a + " != " + b + " and " + a + " <= " + b);
        } else if (a >= b) {
            System.out.println(a + " != " + b + " and " + a + " >= " + b);
        }
    }
}