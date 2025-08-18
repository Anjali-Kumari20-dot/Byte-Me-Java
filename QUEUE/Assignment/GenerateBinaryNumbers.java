package QUEUE.Assignment;

import java.util.Stack;

public class GenerateBinaryNumbers {
    public static void DecimalToBinary(int num){
        for(int i = 1; i <= num; i++){
            Stack<Integer> s = new Stack<>();
            int temp = i;
            while(temp > 0){
                s.push(temp % 2);
                temp /= 2;
            }
            while(!s.isEmpty()){
                System.out.print(s.pop());
            }
            System.out.println();
        }
    }
     public static void convert(int num) {
        if (num == 0) return;

        convert(num / 2);           // Recursive call
        System.out.print(num % 2);  // Print remainder on unwind
    }
    public static void main(String[] args) {
        DecimalToBinary(5);
    }
}
