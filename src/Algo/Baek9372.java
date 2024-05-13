package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek9372 {

    static int N,M,result;
    static int[][] arr;
    static boolean[] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int T = Integer.parseInt(bufferedReader.readLine());

        while(T --> 0){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            N = Integer.parseInt(stringTokenizer.nextToken());
            M = Integer.parseInt(stringTokenizer.nextToken());

            arr = new int[N+1][N+1];
            visit = new boolean[N+1];

            for(int i=0; i<M; i++){
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());

                arr[a][b] = arr[b][a] = 1;
            }

            BFS();
        }

    }

    private static void BFS(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        result = 0;

        while(!queue.isEmpty()){
            result++;
            int num = queue.poll();

            for(int i=1; i<=N; i++){
                if(arr[num][i]==1 && !visit[i]){
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println(result-1);

        //최소 간선을 구하려면 : 노드 -1
    }
}
