package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek17086 {

    static int[][] map;
    static boolean[][] visitied;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        map = new int[N][M];

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }


    }

    private static int BFS(){
        return 0;
    }
}
