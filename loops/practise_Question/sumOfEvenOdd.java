package loops.practise_Question;

import java.util.*;

import conditional_Statements.evenORodd;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                EvenSum += i;
            else
                OddSum += i;
        }
        System.out.println("Even Sum : " + EvenSum);
        System.out.println("Odd Sum : " + OddSum);
    }
}
