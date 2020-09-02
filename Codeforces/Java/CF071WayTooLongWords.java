package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://codeforces.com/problemset/problem/71/A
 */
public class CF071WayTooLongWords {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] looong) throws IOException {

        int n = Integer.parseInt(in.readLine());
        String line;
        int length;
        while(n-- > 0) {

            line = in.readLine();
            length = line.length();
            if (length > 10) {
                out.println(
                        String.valueOf(line.charAt(0))
                                + (length - 2)
                                + String.valueOf(line.charAt(length - 1)));
            } else {
                out.println(line);
            }
        }
        out.close();
    }
}
