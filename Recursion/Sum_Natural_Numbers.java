package Recursion;

public class Sum_Natural_Numbers {
    public static int Rec_Sum(int n){
        if(n == 0) return 0;
        return n + Rec_Sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(Rec_Sum(5));
    }
}
