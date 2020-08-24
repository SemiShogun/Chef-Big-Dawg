import java.util.Arrays;

public class QuickSort {
    public static void main(String[] Sonic) {
        System.out.println("Here is an example of Quicksort.");
        int[] values = {12,32,534,674,634,868,3,4,78,27,3,6,5435,34,1};
        sort(values);
    }

    public static void sort(int[] values) {
        quickSort(values);
    }

    public static void quickSort(int[] arr) {
        if (arr == null) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int splitPoint = partition(arr, low, high);
            quickSort(arr, low, splitPoint);
            quickSort(arr, splitPoint + 1, high);
        }
    }

    // Hoare partition algorithm
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while(arr[i] < pivot);
            do {
                j--;
            } while(arr[j] > pivot);
            if(i < j) {
                swap(arr, i, j);
            } else {
                return j;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
