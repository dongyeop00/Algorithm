package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek9095 {
    /*
    점화식 : dp[n] = dp[n-3] + dp[n-2] + dp[n-1]
     */
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<=10; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i=0; i<n; i++){
            int d = Integer.parseInt(bufferedReader.readLine());
            System.out.println(dp[d]);
        }
    }
}

/*
n = 1일때
1
dp[1] = 1

n = 2 일때
1+1
2
dp[2] = 2

n = 3 일때
1+1+1
2+1
1+2
3
dp[3] = 3

n = 4 일때
1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
dp[4] = 7

점화식 유도 과정
n=4에서
1+1+1+1
2+1+1
1+2+1
3+1
이 n=3과정의 앞부분이 동일

1+1+2
2+2
이 n=2과정의 앞부분이 동일

1+3
이 n=1과정의 앞부분이 동일

결국 dp[4]는 dp[3]+dp[2]+dp[1]을 더한 것과 같다.
점화식 : dp[n] = dp[n-1]+dp[n-2]+dp[n-3]
 */