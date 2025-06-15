package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'n', 'j', 'a', 'l', 'i'};
        String str = "Abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE 

        Scanner sc = new Scanner(System.in); 
        String name;
        // name = sc.next();
        name = sc.nextLine();
        System.out.println(name);
        
        // charAt
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i) + " ");
        }
    }
}
