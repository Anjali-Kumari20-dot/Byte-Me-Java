package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(12);
        list.add(33);
        list.add(42);
        list.add(5);

        System.out.println("Before Sorting : " + list);
        Collections.sort(list); // Ascending
        System.out.println("After Sorting : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse order : " + list);

        // Comparator - fnx logic
    }
}
