package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[9];
//
//        int max = 0;
//        int idx = 0;
//        for (int i = 0; i < 9; i++) {
//            int N = Integer.parseInt(br.readLine());
//            arr[i] = N;
//
//            if (arr[i] > max) {
//                max = arr[i];
//                idx = i;
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(idx + 1);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[9];

        int max = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = N;
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}
