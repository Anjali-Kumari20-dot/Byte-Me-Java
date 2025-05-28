package conditional_Statements.Practise_Question;

import java.util.Scanner;

public class LeapORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
