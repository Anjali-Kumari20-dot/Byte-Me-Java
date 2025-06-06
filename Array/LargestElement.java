package Array;

public class LargestElement {
    public static void betterSecLarge(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            if (arr[i] > secLargest && arr[i] != largest)
                secLargest = arr[i];
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest: " + secLargest);
    }

    public static void optimalSecLargest(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest: " + secLargest);
    }

    public static void isSorted(int arr[]) {
        int n = arr.length;
        boolean isSorted = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) System.out.println("Array is Sorted");
        else System.out.println("Array is not Sorted");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 7 };
        // optimalSecLargest(arr);
        isSorted(arr);
    }
}