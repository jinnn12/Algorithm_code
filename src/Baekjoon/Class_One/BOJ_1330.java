package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);

//        if (A > B) {
//            System.out.println(">");
//        }
//        if (A < B) {
//            System.out.println("<");
//        }
//        if (A == B) {
//            System.out.println("==");
//        }

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
        br.close();
    }
}
