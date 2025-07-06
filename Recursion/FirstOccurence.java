package Recursion;

public class FirstOccurence {
    public static int  firstOccured(int[] nums,int target, int index){
        if(index == nums.length - 1) {
            System.out.println("Not Found");
            return -1;
        };
        if(nums[index] == target) return index;
        return firstOccured(nums, target, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 7, 5};
        int target = 5;
        System.out.println("First occurence of " + target + " is at index : " + firstOccured(arr, target , 0));
    }
}
