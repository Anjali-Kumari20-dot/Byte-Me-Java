package variables_and_datatypes.Practise_Question;

import java.util.Scanner;

public class Area_sq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);
    }
}
