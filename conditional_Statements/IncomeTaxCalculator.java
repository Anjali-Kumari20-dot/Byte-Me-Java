package conditional_Statements;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income < 500000){
            System.out.println("No tax");
            System.out.println();
        } else if (income > 500000 && income < 1000000){
            System.out.println(income * 0.2 + " Tax deducted");
        } else {
            System.out.println(income * 0.3 + " Tax deducted");
        }

    }
}
