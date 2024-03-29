package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek24479 {

    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static int[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 정점의 수
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 간선의 수
        int R = Integer.parseInt(stringTokenizer.nextToken()); // 시작 정점

        visited = new int[N+1];

        // 인접 리스트 초기화
        for(int i=0; i<N+1; i++){
            A.add(new ArrayList<Integer>());
        }

        //인접 리스트 값 추가
        for(int i=0; i<M; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            A.get(s).add(e);
            A.get(e).add(s);
        }

        //오름차순으로 순행
        for(int i=1; i<N+1; i++){
            Collections.sort(A.get(i));
        }

        count = 0; // 시작 카운트는 0부터 시작
        DFS(R);

        for(int i=1; i< visited.length; i++){
            stringBuilder.append(visited[i]).append("\n");
        }

        System.out.println(stringBuilder.toString());
    }

    static void DFS(int v){
        count++; // 재귀 호출 전에 카운트를 증가시킴
        visited[v] = count;

        for(int i=0; i<A.get(v).size(); i++){
            int node = A.get(v).get(i);
            if(visited[node] == 0){
                DFS(node);
            }
        }
    }
}
