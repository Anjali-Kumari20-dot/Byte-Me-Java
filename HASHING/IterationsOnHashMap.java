package HASHING;

import java.util.*;

public class IterationsOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // 1. Iterating using keySet() - O(n)
        Set <String> keys = hm.keySet();
        // System.out.println(keys);

        for(String key : keys){
            System.out.println("Key : " + key + "  -->  " + "Value : " + hm.get(key));
        }
    }
}
