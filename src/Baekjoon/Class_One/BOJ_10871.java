package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);

        String[] sequence = br.readLine().split(" ");
        int[] arr = new int[sequence.length];

        for (int i = 0; i < N; i++) {
            int y = Integer.parseInt(sequence[i]);
            if (y < X) {
                System.out.print(y + " ");
            }

        }






    }
}
