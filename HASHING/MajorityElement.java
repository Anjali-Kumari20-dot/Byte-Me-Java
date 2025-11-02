package HASHING;
import java.util.HashMap;

public class MajorityElement { // Time Complexity: O(n)
    // Given an integer array of size n, find all elements
    // that appear more than ⌊ n/3 ⌋ times.

    // nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1} -- output -> 1
    // nums[] = {1, 2} -- output -> 1, 2
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else{
            //     map.put(arr[i], 1);
            // }

            // shorthand for above if else code
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Integer key: map.keySet()){
            if(map.get(key) > arr.length / 3){
                System.out.println(key);
            }
        }
    }
}
