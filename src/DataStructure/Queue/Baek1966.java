package DataStructure.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int testcase = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < testcase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int N = Integer.parseInt(stringTokenizer.nextToken()); // 문서의 개수
            int M = Integer.parseInt(stringTokenizer.nextToken()); // M번째 문서가 몇번째로 출력되는지

            LinkedList<int[]> queue = new LinkedList<>();

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            //[값,중요도] 세팅
            for(int j=0; j<N; j++){
                queue.add(new int[] {j, Integer.parseInt(stringTokenizer.nextToken())});
            }

            int count = 0;


            while(!queue.isEmpty()){


                int[] first = queue.poll();
                boolean isMax = true;

                for(int a=0; a<queue.size(); a++){

                    if(first[1] < queue.get(a)[1]){
                        queue.add(first);
                        for(int b=0; b<a; b++){
                            queue.add(queue.poll());
                        }
                        isMax = false;
                        break;
                    }

                }

                if(isMax == false){
                    continue;
                }

                count++;
                if(first[0] == M){
                    break;
                }

            }

            stringBuilder.append(count).append("\n");


        }

        System.out.println(stringBuilder.toString());


    }
}
