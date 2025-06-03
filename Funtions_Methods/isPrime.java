package Funtions_Methods;

public class isPrime {
    public static boolean isPrime(int n){
        if(n <= 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int from, int to){
        for(int i = from; i < to; i++){
            if(isPrime(i)) 
                System.out.println(i+ " ");
        }
    }
    public static void main(String[] args) {
        PrimeInRange(23, 56 );
    }
}
