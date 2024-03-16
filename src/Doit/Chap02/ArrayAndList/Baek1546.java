package Doit.Chap02.ArrayAndList;

import java.util.Scanner;

public class Baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        long max = 0;
        long sum = 0;

        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
            if(max < score[i]){
                max = score[i];
            }
            sum += score[i];
        }

        System.out.println( sum * 100.0 / max / n);

    }
}
