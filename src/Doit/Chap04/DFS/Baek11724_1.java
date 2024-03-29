package Doit.Chap04.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek11724_1 {

    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[n+1];

        for(int i=0; i<n+1; i++){
            A.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            A.get(s).add(e);
            A.get(e).add(s);
        }

        int count = 0;


        for(int i=1; i < n+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v){
        if(visited[v]){
            return;
        }

        visited[v] = true;
        for(int i : A.get(v)){
            if(visited[i] == false){
                DFS(i);
            }
        }
    }
}
