package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int testcase = 1;

        while(true){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            // 5 8 20
            int L = Integer.parseInt(stringTokenizer.nextToken()); //L일 동안 사용 가능
            int P = Integer.parseInt(stringTokenizer.nextToken()); //P일 중
            int V = Integer.parseInt(stringTokenizer.nextToken()); //V 휴가 수
            int use = 0;

            if(L==0 && P==0 && V==0){
                break;
            }

            use = V / P * L;  // 20 / 8 * 5 = 10

            if(L > V%P) {
                use += V % P;
            }else{
                use += L;
            }

            //나머지 4일 계산
            System.out.println("Case " + testcase + ": " + use);
            testcase++;
        }
    }
}
