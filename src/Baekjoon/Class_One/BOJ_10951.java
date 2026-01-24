package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {

        /// case 1)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line;

//        while ((line = br.readLine()) != null) {
//            String[] inputs = line.split(" ");
//            int A = Integer.parseInt(inputs[0]);
//            int B = Integer.parseInt(inputs[1]);
//            System.out.println(A + B);
//        }

        ///  case 2)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String str;
//        StringTokenizer st;
//
//        while ((str = br.readLine()) != null) {
//            st = new StringTokenizer(str, " ");
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//            sb.append(A+B).append("\n");
//            System.out.println(sb);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }



    }
}
