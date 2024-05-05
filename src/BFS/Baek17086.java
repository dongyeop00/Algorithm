package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek17086 {

    static int[][] map;
    static boolean[][] visitied;
    static int result;
    static Queue<int []> q;
    static int[] dx= {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        map = new int[N][M];
        visitied = new boolean[N][M];
        q = new LinkedList<>();
        result = 0;

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if(map[i][j]==1){
                    q.offer(new int[] {i,j});
                }
            }
        }

        BFS();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] > 1){
                    result = Math.max(result, map[i][j]);
                }
            }
        }

        System.out.println(result-1);

    }

    private static void BFS(){
        while(!q.isEmpty()){
            int[] shark = q.poll();
            int x = shark[0];
            int y = shark[1];

            for(int i=0; i<8; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];

                if(newX >= 0 && newY >= 0 && newX < N && newY < M && !visitied[newX][newY]){
                    visitied[newX][newY] = true;
                    if(map[newX][newY] == 0){
                        map[newX][newY] = map[x][y]+1;
                        q.offer(new int[] {newX,newY});
                    }
                }
            }
        }
    }
}
