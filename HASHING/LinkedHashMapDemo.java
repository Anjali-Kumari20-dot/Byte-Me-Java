package HASHING;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("USA", 50);
        lhm.put("China", 150);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("China", 150);

        System.out.println("Using HashMap : " + hm);
        System.out.println("Using Linked HashMap : " + lhm);
    }
}