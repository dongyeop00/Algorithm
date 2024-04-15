package DataStructure.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek1021 {

    /**
     첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
     왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
     오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] answer = new int[M];
        int count = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<M; i++){
            answer[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i=1; i<=N; i++){
            deque.offer(i);
        }

        for(int i=0; i<M; i++){
            int target = deque.indexOf(answer[i]);
            int half;

            if(deque.size() % 2 == 0){
                half = deque.size() / 2 - 1;
            }else{
                half = deque.size() / 2;
            }

            //찾을 값이 절반 보다 앞에 있을 경우 2번 연산
            if(target <= half){
                for(int a = 0; a < target; a++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            //찾을 값이 절반 보다 뒤에 있을 경우 3번 연산
            else{
                for(int a =0; a < deque.size() - target; a++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
