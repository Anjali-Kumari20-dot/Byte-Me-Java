package STACK;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] nextGreater = new int[n];

        for(int i = n - 1; i >= 0; i--){
            while(!s.empty() && arr[s.peek()] <= arr[i]) s.pop();

            if(s.empty()) nextGreater[i] = -1;
            else nextGreater[i] = arr[s.peek()];

            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int[] result =  nextGreaterElement(arr);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }
    }
}
