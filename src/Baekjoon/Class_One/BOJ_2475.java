package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int D = Integer.parseInt(inputs[3]);
        int E = Integer.parseInt(inputs[4]);

        int answer = ((A * A) + (B * B) + (C * C) + (D * D) + (E * E)) % 10;

        System.out.println(answer);
        br.close();
    }
}
