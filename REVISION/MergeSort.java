package REVISION;

public class MergeSort {
    public static void mergeSort(int[] arr, int startIdx, int endIdx){
        if(startIdx >= endIdx){
            return ;
        }

        int midIdx = startIdx + (endIdx - startIdx)/2;
        mergeSort(arr, startIdx, midIdx);
        mergeSort(arr, midIdx + 1, endIdx);

        merge(arr, startIdx, endIdx, midIdx);
    }
    public static void merge(int arr[], int startIdx, int endIdx, int midIdx){
        int temp[] = new int[startIdx + endIdx - 1];
        int k = 0; 
        int i = startIdx;
        int j = midIdx + 1;

        while(i <= midIdx && j <= endIdx){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
            }else{
                temp[k] = arr[j];
            }
            k++;
        }

        while(i <= midIdx){
            temp[k] = arr[k];
            k++;
        }

        while(j <= endIdx){
            temp[k] = arr[k];
            k++;
        }

        for(k = 0, i = startIdx; i < temp.length; i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);        
    }
}  
