package Doit.Chap02.PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] A = new int[N+1][M+1];

        for(int i=1; i<=N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1; j<=M; j++){
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int K = Integer.parseInt(stringTokenizer.nextToken());

        while(K > 0 ){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int sum = 0;

            for(int i = x1; i <= x2; i++){
                for(int j = y1; j <= y2; j++){
                    sum += A[i][j];
                }
            }
            System.out.println(sum);
            K--;
        }
    }
}
