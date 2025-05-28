package variables_and_datatypes.Practise_Question;

import java.util.Scanner;

public class total_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil_price = sc.nextInt();
        int pen_price = sc.nextInt();
        int eraser_price = sc.nextInt();
        float gst = 0.18f;
        float tax = (float) (pen_price * gst + pencil_price * gst + eraser_price * gst);
        int amount = (pen_price + pencil_price + eraser_price);
        float total_price = (amount - tax);
        System.out.println("Amount      : " + amount);
        System.out.println("Tax         : " + tax);
        System.out.println("Total Price : " + total_price);
    }
}
