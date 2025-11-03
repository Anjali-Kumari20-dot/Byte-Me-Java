package HASHING;
import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] num = {4, 3, 2, 5, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++){
            set.add(num[i]);
        }

        System.out.println("Count of distinct elements: "+ set.size());
    }
}
