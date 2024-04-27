package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int change = Integer.parseInt(bufferedReader.readLine());
        change = 1000 - change;

        int[] num = {500,100,50,10,5,1};
        int count = 0;

        for(int i=0; i<num.length; i++){
            if(num[i] <= change){
                count += change/num[i];
                change %= num[i];
            }
        }

        System.out.println(count);
    }
}
