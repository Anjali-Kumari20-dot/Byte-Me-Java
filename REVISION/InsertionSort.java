package REVISION;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int current_el = arr[i];
            int prev_pos = i - 1;

            while(prev_pos >= 0 && arr[prev_pos] > current_el){
                arr[prev_pos + 1] = arr[prev_pos];
                prev_pos--;
            }
            arr[prev_pos + 1] = current_el;
        }

        for(int i = 0; i < n; i ++){
            System.out.print(arr[i]+ ", ");
        }
    }
}