package timus;

import java.util.Scanner;
import java.io.*;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int result = (N * (A*B)) * 2;

        out.println(result);
        out.flush();
    }
}

