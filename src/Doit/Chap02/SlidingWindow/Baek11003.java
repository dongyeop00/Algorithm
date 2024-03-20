package Doit.Chap02.SlidingWindow;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        Deque<Node> mydeque = new LinkedList<>();

        for(int i = 0; i<N; i++){
            int now = Integer.parseInt(stringTokenizer.nextToken());

            //1. 덱의 마지막 위치에서부터 now보다 큰 값은 덱에서 제거하기
            while(!mydeque.isEmpty() && mydeque.getLast().value > now){
                mydeque.removeLast();
            }

            //2. 덱의 마지막 위치에 now값 저장하기
            mydeque.addLast(new Node(now, i));

            //3. 덱의 1번째 위치에서부터 L의 범위를 벗어난 값 (index <= now index - L)을 덱에서 제거하기
            if(mydeque.getFirst().index<= i - L){
                mydeque.removeFirst();
            }

            //4. 덱의 1번째 데이터 출력하기
            bufferedWriter.write(mydeque.getFirst().value + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }

    static class Node{
        public int value;
        public int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
