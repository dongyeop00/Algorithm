package Greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("-");
        //int result = Integer.parseInt(arr[0]);
        int result = Integer.MAX_VALUE; //2154---- 2^10 int형에서 가장 큰 최대값


        for(int i=0;i<arr.length;i++){
            String[] plus = arr[i].split("\\+");
            int tmp = 0;
            for(String s : plus){
                tmp += Integer.parseInt(s);
            }
            if(result == Integer.MAX_VALUE){
                result = tmp;
            }else{
                result -= tmp;
            }
        }
        System.out.println(result);
    }
}

