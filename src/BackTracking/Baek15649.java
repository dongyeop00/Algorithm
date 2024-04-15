package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek15649 {

    public static int N,M;
    public static int[] arr;
    public static boolean[] visited;

    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        arr = new int[M];
        visited = new boolean[N];

        func(0);
        System.out.println(stringBuilder.toString());
    }

    public static void func(int depth){
        if (depth == M){
            for(int val : arr){
                stringBuilder.append(val).append(' ');
            }
            stringBuilder.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            // 만약 해당 노드(값)을 방문하지 않았다면?
            if (!visited[i]) {
                visited[i] = true; // 해당 노드를 방문상태로 변경
                arr[depth] = i + 1; // 해당 깊이를 index로 하여 i + 1 값 저장
                func(depth + 1); // 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출

                // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
                visited[i] = false;
            }
        }

    }
}
