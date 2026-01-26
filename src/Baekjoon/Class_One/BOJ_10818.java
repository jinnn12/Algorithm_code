package Baekjoon.Class_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /// case 1 : 배열 정렬 * 시간복잡도 상당함 (정렬 및 순회)
//        int N = Integer.parseInt(br.readLine());
//        String[] inputs = br.readLine().split(" ");
//        int[] arr = new int[N];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(inputs[i]);
//        }
//        Arrays.sort(arr);
//        int min = arr[0];
//        int max = arr[N - 1];
//
//        System.out.println(min + " " + max);

        /// case 2 : 배열 선언 후 순회
        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] arr = new int[N];
        arr[0] = Integer.parseInt(inputs[0]); // 배열의 0번째 인덱스 초기화
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);




    }
}
