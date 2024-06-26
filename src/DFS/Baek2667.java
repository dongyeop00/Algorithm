package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek2667 {
    static int N;
    static int[][] danji;
    static boolean[][] visitied;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        danji = new int[N][N];
        visitied = new boolean[N][N];

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String str = stringTokenizer.nextToken(); //01010110
            for(int j=0; j<N; j++){
                danji[i][j] = str.charAt(j)-'0';
                // danji[i][j]= str.charAt(j) - '0';
            }
        }

        ArrayList<Integer> countList = new ArrayList<>();

        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(danji[x][y] == 1 && !visitied[x][y]){
                    count = 0;
                    DFS(x,y);
                    countList.add(count);
                }
            }
        }

        System.out.println(countList.size());

        Collections.sort(countList);

        for (Integer integer : countList) {
            System.out.println(integer);
        }

    }

    public static void DFS(int x, int y){
        visitied[x][y] = true;
        count++;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            // x,y 좌표가 구역 내부에 있으며, 방문하지 않은 구역에 배추가 있을 경우
            if(cx >= 0 && cy >= 0 && cx < N && cy < N){
                if(danji[cx][cy] ==1 && !visitied[cx][cy]){
                    DFS(cx,cy);
                }
            }
        }
    }
}
