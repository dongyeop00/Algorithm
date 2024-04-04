package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2667 {
    static int N;
    static int[][] danji;
    static boolean[][] visitied;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        N = Integer.parseInt(stringTokenizer.nextToken());
        danji = new int[N][N];
        visitied = new boolean[N][N];

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String str = stringTokenizer.nextToken(); //01010110
            for(int j=0; j<N; j++){
                danji[i][j] = (int)str.charAt(j);
                // danji[i][j]= str.charAt(j) - '0';
            }
        }



    }
}
