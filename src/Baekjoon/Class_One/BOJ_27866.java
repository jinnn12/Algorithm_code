package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27866 {
    public static void main(String[] args) throws IOException {
        ///  case 1)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String S = br.readLine();
//        int i = Integer.parseInt(br.readLine()) - 1; // charAt() 메서드는 0번째부터 세기 때문에 "-1"
//
//        System.out.println(S.charAt(i));


        ///  case 2)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String[] sArr = S.split("");

        int i = Integer.parseInt(br.readLine());

        System.out.println(sArr[i - 1]);
    }
}
