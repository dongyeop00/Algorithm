package Bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek5883 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];
        int[] cnt = new int[1000000];
        int max = 0;

        //입력
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            cnt[arr[i]]++;
        }

        //로직
        for (int i = 0; i < N; i++) {

        }



    }
}
