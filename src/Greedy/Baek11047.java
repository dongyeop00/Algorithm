package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int[] coin = new int[N];
        int count = 0;

        for(int i=0; i<N; i++){
            coin[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for(int i = N-1; i>=0; i--){
            if(coin[i] <= K){
                count += K/coin[i];
                K %= coin[i];
            }
        }

        System.out.println(count);
    }
}
