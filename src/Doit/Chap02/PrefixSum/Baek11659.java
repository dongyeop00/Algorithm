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

        long[] s = new long[N+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 다음 줄 이동
        for(int i=1; i<=N; i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int a=0; a<M; a++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
    }
}
