import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] Darwin) {
        System.out.println("Here is a selection sort example.");
        int[] values = {1,3452,645,453,535,6,7,34,6,3,253,4,24,2};
        sort(values);
    }

    public static void sort(int[] values) {
        selectionSort(values);
    }

    private static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for(int i = 1; i < arr.length; i++) {
            int swapIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[swapIndex]) {
                    swapIndex = j;
                }
            }
            swap(arr, i, swapIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
