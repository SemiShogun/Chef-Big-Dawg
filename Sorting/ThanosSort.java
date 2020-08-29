import com.sun.source.tree.Tree;

import java.util.*;

public class ThanosSort {

    public static void main(String[] AntmanGoesUpHisAss) {
        HashMap<Integer, String> avengers = new HashMap<>();

        avengers.put(0, "Ironman");
        avengers.put(1, "Antman");
        avengers.put(2, "Captain America");
        avengers.put(3, "Thor");
        avengers.put(4, "Hulk");
        avengers.put(5, "Black Widow");
        avengers.put(6, "Hawkeye");
        avengers.put(7, "Black Panther");
        avengers.put(8, "Captain Jack");
        avengers.put(9, "Captain Marvel");
        avengers.put(10, "Starlord");
        avengers.put(11, "Bucky");
        avengers.put(12, "Spiderman");
        avengers.put(13, "Rocket");
        avengers.put(14, "Groot");

        System.out.println("Thanos: *Snaps his fingers*");
        System.out.println();
        System.out.println("Remaining heroes: ");
        System.out.println(thanosSort(avengers));

    }

    public static HashMap<Integer, String> thanosSort(HashMap<Integer, String> arr) {

        int half = ((1 + arr.size()) / 2) - 1;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        HashMap<Integer, String> deposit = new HashMap<>();

        while (numbers.size() <= half) {
            int random = new Random().nextInt(arr.size());
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        // Oh snap! The heroes are disappearing...
        for (int i = 0; i <= half; i++) {
            arr.remove(numbers.get(i));
        }

        Integer[] heroes = arr.keySet().toArray(new Integer[0]);

        // Sort the heroes using bubble sort
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.size(); i++) {
                if (heroes[i] < heroes[i - 1]) {
                    swap(heroes, i, i - 1);
                    sorted = false;
                }
            }
        }

        for(int i: heroes) {
            deposit.put(i, arr.get(i));
        }

        return deposit;
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
    }
}