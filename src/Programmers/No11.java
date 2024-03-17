package Programmers;

import java.util.Arrays;
import java.util.Locale;

// 1단계 - 이상한 문자 만들기
// 각 단어의 짝수번째 알파벳은 대문자
// 각 단어의 홀수번째 알파벳은 소문자
// 0123456789
// try hello world
// TrY HeLlo WoRlD
public class No11 {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";
        String[] str = s.split("");

        int index = 0;
        for(int i=0; i<s.length(); i++){
            if(str[i].equals(" ")){
                index = 0;
            } else if(index % 2 == 0){
                str[i] = str[i].toUpperCase();
                index++;
            } else if(index % 2 != 0){
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer +=str[i];
        }

        System.out.println(answer);
    }
}
