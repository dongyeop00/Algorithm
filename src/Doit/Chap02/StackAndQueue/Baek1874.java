package Doit.Chap02.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;

        for(int i=0; i<A.length; i++){
            int present = A[i];
            if(present >= num ){
                while(present >= num){
                    stack.push(num++);
                    stringBuilder.append("+\n");
                }
                stack.pop();
                stringBuilder.append("-\n");
            }else{ // present < num
                int n = stack.pop();
                if(n > present){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    stringBuilder.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(stringBuilder.toString());
        }
    }
}
