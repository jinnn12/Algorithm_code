package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {

        /// case 1)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        String[] arr = br.readLine().split("");
//
//        int sum = 0;
//        for (int i = 0; i < N; i++) {
//            sum += Integer.parseInt(arr[i]);
//        }
//        System.out.println(sum);

//
//        ///  case 2)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        String s = br.readLine();
//
//        int sum = 0;
//        for (int i = 0; i < N; i++) {
//            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
//        }
//        System.out.println(sum);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String inputs = br.readLine();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(inputs.charAt(i)));
        }

        System.out.println(sum);



















    }
}
