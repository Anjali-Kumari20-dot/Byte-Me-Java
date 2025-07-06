package Recursion;

public class isArraySorted {
    public static boolean isSorted(int[] nums , int index){
        int n = nums.length;
        if(index == n - 1) return true;
        if(nums[index] > nums[index + 1]) return false;
        return isSorted(nums, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is array Sorted? : " + isSorted(arr, 0));
    }
}
