package Divide_And_Run;

public class MergeSort {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si,int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si; // index for first sorted part
        int j = mid + 1; // index for 2nd sorted part
        int k = 0; // index for temp

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        // leftover elements of first sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // leftover elents of second sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}