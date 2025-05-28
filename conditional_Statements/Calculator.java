package conditional_Statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Case 1: Addition");
        System.out.println("Case 2: Subtraction");
        System.out.println("Case 3: Multiplication");
        System.out.println("Case 4: Division");
        System.out.println("Case 5: Remainder");
        System.out.println("------------------------------");
        System.out.print("Enter Marzi from 1 to 5 : ");
        int marzi = sc.nextInt();
        int calculate;

        switch (marzi) {
            case 1:
                calculate = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + calculate);
                break;
            case 2:
                calculate = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + calculate);
                break;
            case 3:
                calculate = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + calculate);
                break;
            case 4:
                calculate = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + calculate);
                break;
            case 5:
                calculate = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + calculate);
                break;
            default: System.out.println("Please Enter Sahi Marzi ! ");
        }
    }
}
