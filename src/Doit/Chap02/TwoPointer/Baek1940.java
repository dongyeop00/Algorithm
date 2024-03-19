package Doit.Chap02.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(A);

        int count = 0;
        int start = 0;
        int end = A.length-1;

        while(start < end){
            if(A[start]+A[end] == M){
                count++;
                start++;
                end--;
            }else if(A[start] + A[end] > M){
                end--;
            }else{
                start++;
            }
        }
        System.out.println(count);
    }
}
