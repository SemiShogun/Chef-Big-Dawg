public class QuickSort {
    public static void main(String[] Sonic) {
        System.out.println("Here is an example of Quicksort.");

    }

    public static void sort(int[] values) {
        quickSort(values);
    }

    public static void quickSort(int[] arr) {
        if (arr == null) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {

    }

    private static int partition(int[] arr, int low, int high) {

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
