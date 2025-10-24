package HASHING;

import java.util.*;

public class TreeHashMapImplementation {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("USA", 50);
        tm.put("China", 150);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("China", 150);

        System.out.println("Using HashMap : " + hm);
        System.out.println("Using Tree HashMap : " + tm);
    }
}
