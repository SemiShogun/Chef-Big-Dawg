import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] Bubblebuddy) {
        System.out.println("Here is a Bubblesort Example");
        int[] values = {1,2,7,3,5,5,5,21,6,34,1,6234,34,5634,77,34,34,2,7,543,2345};
        sort(values);
    }

    public static void sort(int[] values) {
        bubbleSort(values);
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null) {
            return;
        }

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i - 1]) {
                    swap(arr, i - 1, i);
                    sorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}