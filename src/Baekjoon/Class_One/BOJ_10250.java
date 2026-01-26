package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 1; i <= T; i++) {
//            String[] inputs = br.readLine().split(" ");
//            int H = Integer.parseInt(inputs[0]);
//            int W = Integer.parseInt(inputs[1]);
//            int N = Integer.parseInt(inputs[2]);
//
//            System.out.println(String.valueOf(N % H) + String.valueOf((N / H) + 1));
//        }

        // N % H == 손님이 배정 받을 층 수
        // (N / H) + 1 == 손님이 배정 받을 방의 번째 수


        int T = Integer.parseInt(br.readLine());

        int floor = 0;
        int roomNo = 0;

        for (int i = 1; i <= T; i++) {
            String[] inputs = br.readLine().split(" ");
            int H = Integer.parseInt(inputs[0]);
            int W = Integer.parseInt(inputs[1]);
            int N = Integer.parseInt(inputs[2]);

            if (N % H == 0) {
                floor = H * 100;
                roomNo = N / H;
            } else {
                floor = (N % H) * 100;
                roomNo = (N / H) + 1;
            }
            System.out.println(floor + roomNo);
        }



    }
}
