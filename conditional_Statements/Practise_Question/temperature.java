package conditional_Statements.Practise_Question;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        int temperature = sc.nextInt();
        String fever = ((temperature > 100 ) ? "Have fever" : "Don't have fever");
        System.out.println(fever);
    }
}
