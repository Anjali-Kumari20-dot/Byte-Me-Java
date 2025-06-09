package Array;
import java.util.Arrays;
import java.util.HashSet;
public class isDuplicate {
    public static boolean appearing(int nums[]) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // int nums[] = { 1, 2, 3, 4 };
        Arrays.sort(nums);
        System.out.println(appearing(nums));
    }
}
