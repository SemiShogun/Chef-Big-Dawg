package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://codeforces.com/problemset/problem/4/A
 */
public class CF004Watermelon {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] watermelon) throws IOException {
        int w = Integer.parseInt(in.readLine());
        out.print((w == 2 || w % 2 != 0) ? "NO" : "YES");
        out.close();
    }   
}