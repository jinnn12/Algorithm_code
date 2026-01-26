package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2884 {
    public static void main(String[] args) throws IOException {
        /// case 1)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] inputs = br.readLine().split(" ");
//
//        int H = Integer.parseInt(inputs[0]);
//        int M = Integer.parseInt(inputs[1]);
//
//        int outH = 0;
//        int outM = 0;
//        if ((0 < H) && (H <= 23) && (0 <= M) && (M <= 59)) {
//            if (M < 45) {
//                outH = H - 1;
//                outM = M + 15;
//            }
//
//            if (M >= 45) {
//                outH = H;
//                outM = M - 45;
//            }
//        }
//
//        if ((0 == H) && (0 <= M) && (M <= 59)) {
//            if (M < 45) {
//                outH = 23;
//                outM = M + 15;
//            }
//
//            if (M >= 45) {
//                outH = H;
//                outM = M - 45;
//            }
//        }
//
//        System.out.println(outH + " " + outM);

        /// case 2)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int H = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        M = M - 45;
        if (M < 0) {
            H--;
            M = M + 60;
            if (H < 0) {
                H = 23;
            }
        }
        System.out.println(H + " " + M);

    }
}
