package REVISION;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int startIdx, int endIdx){
        // Base case
        if(startIdx >= endIdx){
            return ;
        }

        // find the middile index -> divide
        int midIdx = startIdx + (endIdx - startIdx)/2;

        // recursively sort the left and right half -> conquer
        mergeSort(arr, startIdx, midIdx); 
        mergeSort(arr, midIdx + 1, endIdx);

        // merge the sorted two halves -> merge
        merge(arr, startIdx, endIdx, midIdx);
    }
    public static void merge(int arr[], int startIdx, int endIdx, int midIdx){
        int temp[] = new int[endIdx - startIdx + 1]; // storing sorted array into a temporary array
        int k = 0; 
        int i = startIdx; // pointer for left half
        int j = midIdx + 1; // pointer for right half

        // merge elements from both halves in sorted order
        while(i <= midIdx && j <= endIdx){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++]; // take element from left half
            }else{
                temp[k++] = arr[j++]; // take element from right half
            }
        }

        // copying leftover elements
        while(i <= midIdx){ temp[k++] = arr[i++]; }
        while(j <= endIdx){ temp[k++] = arr[j++]; }

        // copying merged results back into original array segment
        for(k = 0, i = startIdx; k < temp.length; k++, i++){ 
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);     
        
        System.out.print(Arrays.toString(arr));
    }
}  
