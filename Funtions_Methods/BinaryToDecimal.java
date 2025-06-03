package Funtions_Methods;
public class BinaryToDecimal {
    public static double binaryToDecimal(String binary){
        double result = 0;
        for(int i = 0; i < binary.length(); i++){
            char bit = binary.charAt(i);
            int bitValue = Character.getNumericValue(bit);
            result += Math.pow(2 , binary.length()-i-1) * bitValue;
        }
        return result;
    }
    public static void main(String[] args) {
        String binary = "10111111";
        System.out.println(binaryToDecimal(binary));
    }
}
