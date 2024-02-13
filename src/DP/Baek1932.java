package DP;

import java.util.Scanner;

public class Baek1932 {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp= new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++){
                dp[i][j] = sc.nextInt();
            }
        }


    }
}
