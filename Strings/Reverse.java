import java.util.Scanner;

public class Reverse {

    public static void main(String[] GIGADRILLBREAKAAAAA) {
        System.out.print("ENTER YOUR STRING: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverse(scanner.nextLine()));
    }
    
    public static void SpinWords(String input) {

        if (input == null) {
            return;
        }

        String result = "";
        String[] words = input.split(" ");

        for(int i = 0; i <= words.length - 1; i++) {
            if(words[i].length() >= 5) {
                String reverse = "";
                for(int j = words[i].length() - 1; j >= 0; j--) {
                    reverse = reverse + words[i].charAt(j);
                }
                result = result + reverse;
            } else {
                result = result + words[i];
            }
            // Spacing
            result = result + " ";
        }

        System.out.println(result);
    }

    public static String reverse(String input) {
        char[] values = input.toCharArray();
        int half = input.length() / 2;

        for(int i = 0; i < half; i++) {
            char temp = values[i];
            values[i] = values[input.length() - i - 1];
            values[input.length() - i - 1] = temp;
        }

        return new String(values);
    }

}