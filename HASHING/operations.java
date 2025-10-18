package HASHING;

import java.util.HashMap;

public class operations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println("Population of India: " + population);

        System.out.println("Population of Indonesia: " + hm.get("Indonesia"));

        // contains key - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove - O(1)
        hm.remove("China");
        System.out.println(hm);
    }
}
