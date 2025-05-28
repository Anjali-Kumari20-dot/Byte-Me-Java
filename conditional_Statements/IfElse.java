package conditional_Statements;

public class IfElse {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("adult: drive, vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenaager");
        } else {
            System.out.println("not adult");
        }
    }
}
