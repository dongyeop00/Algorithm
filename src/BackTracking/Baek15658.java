package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek15658 {

    static int[] num;

    static int[] operation;
    static int N;

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        num = new int[N];
        operation = new int[4];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 4; i++) {
            operation[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        DFS(1,num[0]);

        System.out.println(max);
        System.out.println(min);
    }

    private static void DFS(int depth, int sum){
        if(depth == N){
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for(int i=0; i<4; i++){
            if(operation[i] > 0){
                operation[i] -= 1;
                switch (i){
                    case 0:
                        DFS(depth+1, sum + num[depth]);
                        break;
                    case 1:
                        DFS(depth+1, sum - num[depth]);
                        break;
                    case 2:
                        DFS(depth+1, sum * num[depth]);
                        break;
                    case 3:
                        DFS(depth+1, sum / num[depth]);
                        break;
                }
                operation[i] += 1;
            }
        }
    }
}
