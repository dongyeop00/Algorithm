package Doit.Chap02.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


//다시 풀기
public class Baek17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        int[] answer = new int[N];
        int[] arr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1; i<N; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

    }
}
