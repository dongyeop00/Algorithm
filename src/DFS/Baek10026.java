package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10026 {
    static char[][] rgb;
    static boolean[][] visitied;
    static int N;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        rgb = new char[N][N];
        visitied = new boolean[N][N];

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String str = stringTokenizer.nextToken();
            for(int j=0; j<N; j++){
                rgb[i][j] = str.charAt(j);
            }
        }


        //정상인경우
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(!visitied[x][y]){
                    DFS(x,y);
                    count++;
                }
            }
        }

        int nomal = count;
        count =0;

        visitied = new boolean[N][N];

        //적록색약인경우
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(rgb[x][y] == 'G'){
                    rgb[x][y] = 'R';
                }
            }
        }

        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(!visitied[x][y]){
                    DFS(x,y);
                    count++;
                }
            }
        }

        int abnomal = count;

        System.out.println(nomal + " " + abnomal);
    }
    public static void DFS(int x, int y){
        visitied[x][y] = true;
        char color = rgb[x][y];

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < N && cy < N){
                if(!visitied[cx][cy] && rgb[cx][cy] == color){
                    DFS(cx,cy);
                }
            }
        }
    }
}
