package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BOJ_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        double A = Double.parseDouble(inputs[0]);
        double B = Double.parseDouble(inputs[1]);

        System.out.println(A / B);
        br.close();

    }
}
