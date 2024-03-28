package Doit.Chap02.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek28278_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int command = Integer.parseInt(stringTokenizer.nextToken());

            if(command == 1){//push
                int item = Integer.parseInt(stringTokenizer.nextToken());
                stack.push(item);
            }else if(command == 2){ //pop
                if(!stack.isEmpty()){
                    stringBuilder.append(stack.pop() + "\n");
                }else{
                    stringBuilder.append(-1 + "\n");
                }
            }else if(command == 3){ //size
                    stringBuilder.append(stack.size() + "\n");
            }else if(command == 4){ //isempty
                if(!stack.isEmpty()){
                    stringBuilder.append(0 + "\n");
                }else{
                    stringBuilder.append(1 + "\n");
                }
            }else if(command == 5){ //top
                if(!stack.isEmpty()){
                    stringBuilder.append(stack.peek() + "\n");
                }else{
                    stringBuilder.append(-1 + "\n");
                }
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
