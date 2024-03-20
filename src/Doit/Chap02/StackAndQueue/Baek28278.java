package Doit.Chap02.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Baek28278 {
    public static int[] stack;
    public static int size = 0;

    static void push(int n){ //1
        stack[size++] = n;
    }

    static int pop(){ //2
        if(size == 0){
            return -1;
        }else{
            int temp = stack[size-1];
            stack[size-1] = 0;
            size--;
            return temp;
        }
    }

    static int size(){ //3
        return size;
    }

    static int empty(){ //4
        if(size() == 0){
            return 1;
        }else{
            return 0;
        }
    }

    static int top(){ //5
        if(size() ==0){
            return -1;
        }else{
            return stack[size-1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        stack = new int[N];

        for(int i=0; i<N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();

            if(command.equals("1")){ //push
                int n = Integer.parseInt(stringTokenizer.nextToken());
                push(n);
            }else if(command.equals("2")){ //pop
                stringBuilder.append(pop() + "\n");
            }else if(command.equals("3")){ //size
                stringBuilder.append(size() + "\n");
            }else if(command.equals("4")){ //empty
                stringBuilder.append(empty() + "\n");
            }else if(command.equals("5")){ //top
                stringBuilder.append(top() + "\n");
            }
        }

        System.out.println(stringBuilder.toString());

    }
}
