package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek19949 {

    static int[] arr;
    static int[] answer;
    static boolean[] visited;
    static int result;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        arr = new int[10];
        answer = new int[10];
        visited = new boolean[10];

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        result = 0;
        DFS(0);

        System.out.println(result);
    }

    private static void DFS(int depth){
        if(depth == 10){
            count=0;
            for(int i=0; i<10; i++){
                if(arr[i] == answer[i]){
                    count++;
                }
            }

            if(count >= 5){
                result++;
            }

        }

        for(int i=0; i<5; i++){
            if(!visited[i]){
                visited[i] = true;
                answer[depth] = i + 1;
                DFS(depth+1);
                visited[i] = false;
            }
        }
    }
}
