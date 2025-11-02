package HASHING;
import java.util.*;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Chennai");
        ts.add("Kolkata");
        
        System.out.println(ts); // sorted order
    }
}
