package Doit.Chap02.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int start_point = 1;
        int end_point = 1;
        int count = 1;
        int sum = 1;

        while(end_point != N){
            if(sum == N){
                count++;
                end_point++;
                sum += end_point;
            }else if(sum > N){
                sum -= start_point;
                start_point++;
            }else{
                end_point++;
                sum += end_point;
            }
        }
        System.out.println(count);
    }
}
