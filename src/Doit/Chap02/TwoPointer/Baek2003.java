package Doit.Chap02.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int count = 0;
        int sum = 0;
        int start_pointer = 0;
        int end_pointer = 0;

        while(true){
            if(sum >= M){
                sum -= A[start_pointer++];
            }else if(end_pointer == N){
                break;
            }else{
                sum += A[end_pointer++];
            }

            if(sum == M){
                count++;
            }
        }

        System.out.println(count);
    }
}
