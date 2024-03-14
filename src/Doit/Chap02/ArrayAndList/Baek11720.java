package Doit.Chap02.ArrayAndList;

import java.util.Arrays;
import java.util.Scanner;

public class Baek11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i=0; i < cNum.length; i++){
            //char to int 방법 2가지
            sum += cNum[i]-'0'; // ex) 9의 아스키 코드 : 57, 0의 아스키코드 : 48 따라서 57-48 = 9라는 값을 얻을 수 있다.
            //sum += Character.getNumericValue(cNum[i]);
        }

        System.out.println(sum);
    }
}
