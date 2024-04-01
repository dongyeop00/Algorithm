package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek2466 {
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static boolean[] visitied;
    static int[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        visitied = new boolean[n+1];
        count = new int[n+1];

        int start = Integer.parseInt(stringTokenizer.nextToken());
        int end = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int m = Integer.parseInt(stringTokenizer.nextToken());

        for(int i=0; i<n+1; i++){
            A.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            A.get(x).add(y);
            A.get(y).add(x);
        }

        DFS(start,end);

        System.out.println(count[end] == 0 ? -1 : count[end]);
    }


    private static void DFS(int start, int end){
        if(start == end){
            return;
        }

        visitied[start] = true;

        for(int i=0; i<A.get(start).size(); i++){
            int node = A.get(start).get(i);
            if(visitied[node] == false){
                count[node] = count[start]+1;
                DFS(node,end);
            }
        }
        visitied[start] = false;
    }
}
