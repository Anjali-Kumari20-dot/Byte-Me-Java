package loops;

import java.util.Scanner;

public class ContinueStatement {
    // to skip iteration
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println("number was : "+ num);
        }while(true);
    }

}
