package Doit.Chap02.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long[] A = new long[N];

        for(int i=0; i<N; i++){
            A[i] = Long.parseLong(stringTokenizer.nextToken());
        }

        Arrays.sort(A);

        int count = 0;

        for(int i=0; i<N; i++){
            long K = A[i];
            int start = 0;
            int end = N-1;
            while(start < end){
                if(A[start] + A[end] == K){
                    if(start != i && end != i){ //start 값과 end값이 동일하지 않을 때
                        count++;
                        break;
                    }else if(start == i){
                        start++;
                    }else if(end == i){
                        end--;
                    }
                }else if(A[start] + A[end] < K){
                    start ++;
                }else{
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}
