package variables_and_datatypes;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.9999f;
        int b = (int) a;
        System.out.println(b);
    }
}
