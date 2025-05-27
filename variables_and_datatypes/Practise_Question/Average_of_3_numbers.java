package variables_and_datatypes.Practise_Question;

import java.util.Scanner;

public class Average_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average = (float)((a + b + c) / 3);
        System.out.print(average);
    }
}
