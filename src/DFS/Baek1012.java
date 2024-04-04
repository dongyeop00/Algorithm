package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1012 {

    static int M,N,K;
    static int[][] ground;
    static boolean[][] visitied;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int testcase = Integer.parseInt(stringTokenizer.nextToken());

        for(int i=0; i<testcase; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            M = Integer.parseInt(stringTokenizer.nextToken());
            N = Integer.parseInt(stringTokenizer.nextToken());
            K = Integer.parseInt(stringTokenizer.nextToken());

            ground = new int[M][N];
            visitied = new boolean[M][N];
            count=0;

            for(int j=0; j<K; j++){
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                int x = Integer.parseInt(stringTokenizer.nextToken());
                int y = Integer.parseInt(stringTokenizer.nextToken());

                ground[x][y] = 1;
            }

            for(int x=0; x<M; x++){
                for(int y=0; y<N; y++){
                    if(ground[x][y] == 1 && !visitied[x][y]){
                        dfs(x,y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int x, int y){
        visitied[x][y] = true;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            // x,y 좌표가 구역 내부에 있으며, 방문하지 않은 구역에 배추가 있을 경우
            if(cx >= 0 && cy >= 0 && cx < M && cy < N){
                if(ground[cx][cy] ==1 && !visitied[cx][cy]){
                    dfs(cx,cy);
                }
            }
        }
    }
}
