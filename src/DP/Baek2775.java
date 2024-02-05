package DP;

import java.util.*;

public class Baek2775 {
    static int[][] dp = new int[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int k,n;

        for(int i=0; i<15; i++){
            dp[0][i] = i;
        }


        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        for(int i=0; i<test; i++){
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(dp[k][n]);
        }
    }

}
