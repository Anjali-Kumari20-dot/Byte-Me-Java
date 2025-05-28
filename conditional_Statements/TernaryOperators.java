package conditional_Statements;

public class TernaryOperators {
    public static void main(String[] args) {
        // variable = condition ? statement1 : statement2;
        int larger = (5 > 3) ? 5 : 3;
        System.out.println(larger);
        int number = 45;
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
