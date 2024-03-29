package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek24480 {

    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static int[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int R = Integer.parseInt(stringTokenizer.nextToken());

        visited = new int[N+1];

        for(int i=0; i<N+1; i++){
            A.add(new ArrayList<Integer>());
        }

        for(int i=0; i<M; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            A.get(s).add(e);
            A.get(e).add(s);
        }

        for(int i=1; i<N+1; i++){
            Collections.sort(A.get(i), Collections.reverseOrder());
        }

        count = 0;
        DFS(R); // R = 1

        for(int i=1; i<visited.length; i++){
            stringBuilder.append(visited[i]).append("\n");
        }

        System.out.println(stringBuilder.toString());

    }

    static void DFS(int v){ // v=1
        count++; // 1
        visited[v] = count; //visited[1] = 1;

        for(int i=0; i<A.get(v).size(); i++){
            int node = A.get(v).get(i); // [4,2] 중 4
            if(visited[node] == 0){ // visited[4] == 0
                DFS(node); //dfs(4)
            }
        }
    }
}
