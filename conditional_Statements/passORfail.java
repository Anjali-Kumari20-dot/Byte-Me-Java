package conditional_Statements;

public class passORfail {
    public static void main(String[] args) {
        int marks = 15;
        String reportCard = (marks > 33) ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}
