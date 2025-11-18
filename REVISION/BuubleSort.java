package REVISION;

public class BuubleSort {
    public static void main(String[] args) {
        // int arr[] = {5, 1, 4, 2, 8};
        int arr[] = {-2, -4, -6, -1, -3};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
