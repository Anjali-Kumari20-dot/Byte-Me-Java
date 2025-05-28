package conditional_Statements.Practise_Question;

import java.util.Scanner;

public class PositiveORnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String identify = ((number >= 0) ? "Positive" : "Negative");
        System.out.println(identify);
    }
}
