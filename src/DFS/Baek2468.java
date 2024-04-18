package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek2468 {

    static boolean[][] visited;
    static int[][] V;
    static int count = 0;
    static int N;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[N][N];
        V = new int[N][N];

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=0; j<N; j++){
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                if(temp <= N){
                    V[i][j] = 0;
                }else{
                    V[i][j] = temp;
                }
            }
        }

        for(int i=0; i<N; i++){
            for (int j = 0; j < N; j++) {
                if(V[i][j] > 5 && !visited[i][j]) {
                    DFS(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void DFS(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            //cx >= 0 && cy >= 0 && cx < M && cy < N
            if(newX >= 0 && newY >= 0 && newX < N && newY < N){
                if(V[newX][newY] > 5 && !visited[newX][newY]) {
                    DFS(newX, newY);
                }
            }
        }
    }


}
