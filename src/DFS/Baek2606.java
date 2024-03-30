package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek2606 {
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer=new StringTokenizer(bufferedReader.readLine());

        int M = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[N+1];

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

        count = 0;
        DFS(1);
        System.out.println(count);

    }

    public static void DFS(int v){
        visited[v] = true;

        for(int i=0; i<A.get(v).size(); i++){
            int node = A.get(v).get(i);
            if(!visited[node]){
                count++;
                DFS(node);
            }
        }
    }
}
