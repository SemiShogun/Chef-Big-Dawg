import java.util.*;

public class ThanosSort {

    public static void main(String[] AntmanKillsThanos) {
        HashMap<Integer, String> avengers = new HashMap<>();

        avengers.put(0, "Ironman");
        avengers.put(3, "Antman");
        avengers.put(1, "Captain America");
        avengers.put(2, "Thor");
        avengers.put(7, "Hulk");
        avengers.put(5, "Black Widow");
        avengers.put(6, "Hawkeye");
        avengers.put(10, "Black Panther");
        avengers.put(9, "Scarlet Witch");
        avengers.put(8, "Captain Marvel");
        avengers.put(11, "Starlord");
        avengers.put(13, "Spiderman");
        avengers.put(12, "Rocket");
        avengers.put(4, "Groot");
        avengers.put(15, "Bucky");
        avengers.put(14, "Gamora");

        System.out.print("Thanos: *Snaps his fingers*" + "\n" + "Remaining heroes: ");
        System.out.println(thanosSort(avengers));
    }

    public static HashMap<Integer, String> thanosSort(HashMap<Integer, String> arr) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        HashMap<Integer, String> deposit = new HashMap<>();
        int half = ((1 + arr.size()) / 2) - 1;
        // Generate random heroes without leaving any duplicates
        while (numbers.size() <= half) {
            int random = new Random().nextInt(arr.size());
            if (!numbers.contains(random)) {
                numbers.add(random);
                arr.remove(random);
            }
        }

        // The array for sorting the heroes
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

        // Deposit the heroes into a separate Hashmap
        for(int i: heroes) {
            deposit.put(i, arr.get(i));
        }

        // Return the Hashmap
        return deposit;
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}