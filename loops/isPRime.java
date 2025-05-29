package loops;

import java.util.Scanner;

public class isPRime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                c++;
                if(c > 1) break;
            } 
        }
        if(c != 0) System.out.println("Not prime");
        else System.out.println("Prime");
    }
}
