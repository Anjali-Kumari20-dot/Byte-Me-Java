package Bit_Manipulation.Questions;

public class IsEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // Even Number
            System.out.println("Even number.");
        }else{
            // Odd number
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
    }
}
