package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static java.lang.StrictMath.ceil;

/**
 * https://codeforces.com/problemset/problem/1/A
 */
public class CF001TheatreSquare {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] BeThereOrBeSquare) throws IOException {
        String[] input = in.readLine().split("\\s");
        double n = Integer.parseInt(input[0]);
        double m = Integer.parseInt(input[1]);
        double a = Integer.parseInt(input[2]);
        long flagstones = (long) (ceil(n / a) * ceil(m / a));
        out.print(flagstones);
        out.close();
    }
}
