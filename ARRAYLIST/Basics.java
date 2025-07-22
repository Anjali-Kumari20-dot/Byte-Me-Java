package ARRAYLIST;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        // String | Boolean | Integer | Float -> class
        // ClassName objectName = new Classname();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();

        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);

        List1.add(1, 9); // O(n)

        System.out.println(List1);

        // Get operation -> O(1)
        int element = List1.get(2);
        System.out.println(element);

        // Remove element -> O(n)
        List1.remove(2);
        System.out.println(List1);

        // Set element at index -> O(n)
        List1.set(3, 6);
        System.out.println(List1);

        // contains element -> O(n)
        System.out.println(List1.contains(1));
        System.out.println(List1.contains(11));

        // Size
        System.out.println("Size of List1 : " + List1.size());
    }
}
