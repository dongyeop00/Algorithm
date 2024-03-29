package Doit.Chap04.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Back13023 {

    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static boolean[] visited;
    static boolean arrived;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        arrived = false;

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

        for(int i=0; i<N+1; i++){
            DFS(i,1);
            if(arrived){
                break;
            }
        }

        if(arrived){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }

    public static void DFS(int v, int depth) {
        if (depth == 5 || arrived) {
            arrived = true;
            return;
        }
        visited[v] = true;
        for (int i = 0; i < A.get(v).size(); i++) {
            int node = A.get(v).get(i);
            if (!visited[node]) {
                DFS(node, depth + 1);
            }
        }
        visited[v] = false; //방문했던곳 취소
    }
}
