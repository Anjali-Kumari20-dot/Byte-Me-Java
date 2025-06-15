package Strings;

public class Questions {
    public static boolean  isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length() - i - 1)) return true;
            else return false;
        }
        return false;
    }

    public static float shortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){

            char dir = path.charAt(i) ;

            if(dir == 'N') y++; // towards north

            else if(dir == 'S') y--; // towards south

            else if(dir == 'E') x++; // towards east

            else x--;  // towards west
            
        }
        float result = (float)Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y-0, 2));
        return result;
    }

    public static void compareStrings(String str){
        String str1 = "Tony";
        String str2 = new String("Tony");

        if(str1.equals(str2)) {
            System.out.println("STrings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
    public static void largestString(){
        String fruits[] = { "apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i = 0; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i] ;
            }
        }
        System.out.println(largest);
    }

    public static void stringBuilder(){
        StringBuilder sb = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("car"));
        shortestPath("WNEENESENNN");
        largestString();
        stringBuilder();
        System.out.println(toUppercase("hello, i am anjali"));
    }
}
