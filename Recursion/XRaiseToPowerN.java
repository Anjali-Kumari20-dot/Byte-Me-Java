package Recursion;

public class XRaiseToPowerN {
    public static int xPowerN(int x , int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * xPowerN(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 8;
        int n = 3;
        System.out.println(xPowerN(x, n));
    }
}
