package Solved.Class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baek1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        sc.nextInt();

        for(int i=0; i<n; i++){
            str[i] = sc.nextLine();
        }

        Arrays.sort(str, new Comparator<String>(){
           public int compare(String str1, String str2) {
               // 단어 길이가 같을 때
               if (str1.length() == str2.length()) {
                   return str1.compareTo(str2);
               } else { // 길이가 같이 않을 때
                        // ex)[2,1,3] 2 compareTO 1 => 2-1 = 1 양수면 switch
                        // -> [1,2,3] 2 compareTo 3 => 2-3 = -1 음수면 stop
                        // -> [1,2,3]
                   return str1.length() - str2.length();
                        /*
                        ex) wont compareTo want => o - a => 양수(아스키값) switch
                           -> want , wont
                         */
               }
           }
        });

        System.out.println(str[0]);

        for(int i=1; i<n; i++){
            // 중복되지 않는 단어만 출력
            if(!str[i].equals(str[i-0])){
                System.out.println(str[i]);
            }
        }

    }
}
