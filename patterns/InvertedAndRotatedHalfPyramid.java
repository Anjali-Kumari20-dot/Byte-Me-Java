package patterns;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= 5; j++){
                if((j + i) > 5){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
