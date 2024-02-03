package DP;


import java.util.Scanner;

public class Baek24416 {
    static int cnt = 0;
    static int dpCnt = 0;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n];
        fin(n);
        fin2(n);
        System.out.print(cnt + " " + dpCnt);
    }

    public static int fin(int n){
        if(n==1 || n ==2) {
            cnt++;
            return 1;
        }
        else return (fin(n-1) + fin(n-2));
    }

    public static int fin2(int n){
        memo[0] = 1;
        memo[1] = 1;

        for(int i=2; i<n; i++){
            dpCnt++;
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n-1];
    }
}
