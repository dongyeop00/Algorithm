package Solved.Class1;

import java.util.Scanner;

public class Baek2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;

        for(int i=0; i< 5; i++){
            n = sc.nextInt();
            sum += (int)Math.pow(n,2);
        }

        System.out.println(sum%10);
    }
}
