package conditional_Statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Press '+': Addition");
        System.out.println("Press '-': Subtraction");
        System.out.println("Press '*': Multiplication");
        System.out.println("Press '/': Division");
        System.out.println("Press '%': Remainder");
        System.out.println("------------------------------");
        System.out.print("Enter Marzi : ");
        char marzi = sc.next().charAt(0);
        int calculate;

        switch (marzi) {
            case '+':
                calculate = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + calculate);
                break;
            case '-':
                calculate = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + calculate);
                break;
            case '*':
                calculate = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + calculate);
                break;
            case '/':
                calculate = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + calculate);
                break;
            case '%':
                calculate = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + calculate);
                break;
            default: System.out.println("Please Enter Sahi Marzi ! ");
        }
    }
}
