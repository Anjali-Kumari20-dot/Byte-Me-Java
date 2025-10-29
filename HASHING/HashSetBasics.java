package HASHING;
import java.util.HashSet;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // duplicate elements not allowed
        set.add(1);

        System.out.println(set); // [1, 2, 3]
        System.out.println(set.size()); // 3
        set.remove(2);

        if(set.contains(2)){
            System.out.println("Set contains 2.");
        }else {
            System.out.println("Set does not contain 2.");
        }

        set.clear();
        System.out.println(set.isEmpty()); // true
    }
}
