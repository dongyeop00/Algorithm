package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek24481 {
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static int[] depth;
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int R = Integer.parseInt(stringTokenizer.nextToken());

        depth = new int[N+1];

        for(int i=0; i<N+1; i++){
            A.add(new ArrayList<Integer>());
            depth[i] = -1;
        }

        for(int i=0; i<M; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            A.get(s).add(e);
            A.get(e).add(s);
        }

        //오름 차순 정렬
        for(int i=0; i<N+1; i++){
            Collections.sort(A.get(i));
        }
        depth[R] = 0;
        DFS(R);

        for(int i=1; i<N+1; i++){
            stringBuilder.append(depth[i] + "\n");
        }

        System.out.println(stringBuilder.toString());
    }

    static void DFS(int v){
        for(int i=0; i<A.get(v).size(); i++){
            int node = A.get(v).get(i); //A.get(1).get(1) = 2
            if(depth[node] == -1){  // depth[2] == -1
                depth[node] = depth[v] + 1;
                DFS(node);
            }
        }
    }
}
