package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BOJ_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] inputs = br.readLine().split(" ");
//
//        int a = Integer.parseInt(inputs[0]);
//        int b = Integer.parseInt(inputs[1]);

        String str;
        StringTokenizer st;


        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if ((0 < a) && (0 < b) && (a < 10) && (b < 10)) {
                System.out.println(a+b);
            }
            if (a == 0 && b == 0) {
                break;
            }
        }

    }
}
