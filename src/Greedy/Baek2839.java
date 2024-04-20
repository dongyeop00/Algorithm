package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        int N = Integer.parseInt(bufferedReader.readLine());

        while(N > 0){
            if(N % 5 == 0){
                N -= 5;
                count++;
            }else if(N % 5 != 0){
                N -= 3;
                count++;
            }
        }

        if(N == 0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }

    }
}
