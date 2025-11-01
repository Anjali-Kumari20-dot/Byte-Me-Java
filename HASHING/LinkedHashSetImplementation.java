package HASHING;
import java.util.*;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        System.out.println(cities); // order not preserved

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Kolkata");
        
        System.out.println(lhs); // order preserved
    }
}
