package Doit.Chap02.PrefixSum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long[] D = new long[N+1];

        for(int i=1; i<=N; i++){
            D[i] = D[i-1] + Integer.parseInt(stringTokenizer.nextToken());
            // 입력 수 배열 : 5 4 3 2 1
            // 구간 합 배열 : 5 9 12 14 15
        }

        for(int i=0; i<M; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(D[b] - D[a-1]);
        }
    }
}
