package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10819 {

    static int[] arr;
    static int[] answer;
    static boolean[] visited;
    static int result;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[N];
        answer = new int[N];
        visited = new boolean[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        DFS(0);
        System.out.println(result);
    }

    private static void DFS(int depth){
        if(depth == N){
            int sum = 0;
            for(int i=0; i< N-1; i++){
                sum += Math.abs(answer[i] - answer[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                answer[depth] = arr[i];
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}
