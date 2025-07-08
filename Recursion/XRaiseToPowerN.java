package Recursion;

public class XRaiseToPowerN {
    public static int xPowerN(int x , int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * xPowerN(x, n - 1);
    }
    public static int optimisedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimisedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 8;
        int n = 3;
        System.out.println(xPowerN(x, n));
        System.out.println(optimisedPower(x, n));
    }
}
