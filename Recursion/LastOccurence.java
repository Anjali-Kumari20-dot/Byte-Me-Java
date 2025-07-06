package Recursion;

public class LastOccurence {
    public static int lastOccured(int[] nums,int index,int target){
        if(index == nums.length) return -1;
        int isFound = lastOccured(nums, index + 1, target);
        if(isFound == -1 && nums[index] == target) return index;
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 7, 5};
        int target = 5;
        System.out.println("Last occurrence of " + target + " is at index: " + lastOccured(arr, 0, target));
    }
}
