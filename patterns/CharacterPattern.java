package patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for(int i = 0; i < 5; i++){
            for(int chars = 1; chars <= i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
