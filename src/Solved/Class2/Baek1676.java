package Solved.Class2;

//N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Baek1676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i=5; i<=n; i*=5){
            count += n / i;
        }

        System.out.println(count);
    }
}
