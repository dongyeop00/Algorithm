package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] meeting = new int[N][2];
        int count = 0;
        int meeting_End = -1;

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            meeting[i][0] = Integer.parseInt(stringTokenizer.nextToken()); //시작 시간
            meeting[i][1] = Integer.parseInt(stringTokenizer.nextToken()); //종료 시간
        }

        // 강의 끝나는 시간 정렬
        Arrays.sort(meeting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                } else{
                    return o1[1] - o2[1];
                }
            }
        });

        // 끝나는 시간 기준으로 찾기
        for (int i = 0; i < N; i++) {
            //
            if(meeting[i][0] >= meeting_End){
                meeting_End = meeting[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
