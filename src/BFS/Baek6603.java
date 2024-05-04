package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek6603 {

    static int N;
    static int[] arr;
    static boolean[] visited;
    static int[] result;
    static StringBuilder stringBuilder = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            N = Integer.parseInt(stringTokenizer.nextToken());
            if(N==0){
                break;
            }

            arr = new int[N];
            result = new int[6];
            visited = new boolean[N];

            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            Back(0,0);
            System.out.println(stringBuilder);
        }
    }

    private static void Back(int start, int depth){
        if(depth==6){
            for(int num : result){
                stringBuilder.append(num).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }

        for(int i=start; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];
                Back(i,depth+1);
                visited[i] = false;
            }
        }

    }
}
