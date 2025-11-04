package HASHING;
import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 2, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        // union
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union Count: " + set.size());

        // Intersection
        set.clear();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]); // to avoid counting duplicates
            }
        }
        System.out.println("Intersection count: "+ count);
    }
}
