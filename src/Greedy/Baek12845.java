package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek12845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        Integer[] num = new Integer[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            num[i]= Integer.parseInt(stringTokenizer.nextToken());
        }

        // 30 30 40
        Arrays.sort(num);
        int max = num[num.length-1]; //40
        int sum = 0;

        for(int i=num.length-2; i>=0; i--){
            sum = sum + max + num[i];
        }

        System.out.println(sum);

    }
}
