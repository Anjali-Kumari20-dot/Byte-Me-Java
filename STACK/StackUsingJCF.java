package STACK;
import java.util.Stack;

public class StackUsingJCF {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String str = "Anjali";
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtBottom(s, 4);
        reverseStack(s);
        String res = reverseString(str);
        System.out.println(res);
    }
}
