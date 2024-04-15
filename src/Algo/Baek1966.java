package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int testcase = Integer.parseInt(stringTokenizer.nextToken());

        while(testcase --> 0){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            LinkedList<int[]> queue = new LinkedList<>();
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;

            for(int i=0; i<N; i++){
                queue.add(new int[] {i, Integer.parseInt(stringTokenizer.nextToken())});
            }

            while(!queue.isEmpty()){
                int[] front = queue.poll();
                boolean max = true;

                for(int a=0; a<queue.size(); a++){
                    if(front[1] < queue.get(a)[1]){
                        for(int b=0; b<a; b++){
                            queue.offer(front);
                        }
                    }

                }

                if(max == false){
                    continue;
                }

                count++;
            }

        }
    }
}
