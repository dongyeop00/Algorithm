package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek19598 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] meeting = new int[N][2];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            meeting[i][0] = Integer.parseInt(stringTokenizer.nextToken()); // 시작 시간
            meeting[i][1] = Integer.parseInt(stringTokenizer.nextToken()); // 종료 시간
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



        queue.offer(new int[]{meeting[0][0], meeting[0][1]});
        for(int i=1; i<N; i++){
            int[] array = queue.peek();
            int value = array[1];

            if(value <= meeting[i][0]){
                queue.poll();
                queue.add(new int[]{meeting[i][0], meeting[i][1]});
            }else{
                queue.add(new int[]{meeting[i][0], meeting[i][1]});
            }
        }

        System.out.println(queue.size());
    }
}
