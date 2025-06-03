package Funtions_Methods;

public class BinomialCofficient {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomialCofficient(int n, int r){
        return(factorial(n)/(factorial(r)*factorial(n-r)));
    }
    public static void main(String[] args) {
        System.out.println(binomialCofficient(10, 5));
    }
}
