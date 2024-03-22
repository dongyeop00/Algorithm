package Doit.Chap02.ArrayAndList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int length = str.length();
        int result = 1;

        for(int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length-1-i)){
                result = 0;
            }
        }
        System.out.println(result);

    }
}
