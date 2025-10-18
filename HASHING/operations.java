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

        
    }
}
