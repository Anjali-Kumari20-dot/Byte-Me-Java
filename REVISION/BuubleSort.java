package REVISION;

public class BuubleSort {
    public static void main(String[] args) {
        // int arr[] = {5, 1, 4, 2, 8};
        int arr[] = {-2, -4, -6, -1, -3};
        int n = arr.length;
        boolean swapped = false;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped)  break; // stop early if already sorted
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
