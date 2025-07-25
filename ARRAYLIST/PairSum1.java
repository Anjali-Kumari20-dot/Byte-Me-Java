package ARRAYLIST;

import java.util.ArrayList;

public class PairSum1 {

    public static boolean pairSum1(ArrayList<Integer> list, int target){
        // O(n^2)
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lp = 0, rp = list.size() - 1;
        // O(n)
        while(lp < rp){
            if((list.get(lp) + list.get(rp)) < target) lp++;
            else if ((list.get(lp) + list.get(rp)) > target) rp--;
            else if((list.get(lp) + list.get(rp)) == target) return true;
        }
        return false;
    }

    // Sorted and Rotated array -> O(n)
    public static boolean pairSum3(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)){
                bp = i;
                break;
            }
        }
        
        int lp = bp + 1;
        int rp = bp;

        while(lp != rp){
            // case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            // case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            } else{
                // case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        int target = 50;

        // System.out.println(pairSum1(list, target));
        // System.out.println(pairSum2(list, target));
        System.out.println(pairSum3(list, target));
    }
}
