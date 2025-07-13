package Backtracking;
import java.util.ArrayList;
import java.util.List;

public class FindSubsets {
    public static void findSubsetsInStrings (String str, int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findSubsetsInStrings(str, i + 1, ans+str.charAt(i));
        findSubsetsInStrings(str, i + 1, ans);
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void findSubsetsInArray(int[] arr, int i, List<Integer> ans){
        if(i == arr.length){
            if(ans.isEmpty()){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        ans.add(arr[i]);
        findSubsetsInArray(arr, i+1, ans);

        ans.remove(ans.size() - 1);
        findSubsetsInArray(arr, i+1, ans);

    }
    public static void main(String[] args) {
        findSubsetsInStrings("abc", 0, "");
        findSubsetsInArray(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }
}
// Leetcode problem - 78
