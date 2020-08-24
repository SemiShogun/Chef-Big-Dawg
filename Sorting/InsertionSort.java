import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] Lenny) {
        System.out.println("Here is an insertion sort example.");
        int[] values = {10,6,32,6,7658,43534,457,46,345,34,7};
        sort(values);
    }

    public static void sort(int[] values) {
        insertionSort(values);
    }

    private static void insertionSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j - 1, j);
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
