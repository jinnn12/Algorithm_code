package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ///  case 1 : StringTokenizer를 활용
//        String s = br.readLine();
//        StringTokenizer st = new StringTokenizer(s);
//
//        System.out.println(st.countTokens());


        ///  case 2 : StreamAPI를 활용
        String s = br.readLine();

        long count = Arrays.stream(s.split(" "))
                .filter(str -> !str.isEmpty())
                .count();

        System.out.println(count);

    }
}
