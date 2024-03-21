package Doit.Chap02.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10773 {

    public static int[] stack;
    public static int size = 0;

    private static void push(int n){
        stack[size++] = n;
    }

    private static void pop(){
        stack[size-1] = 0;
        size--;
    }

    private static int sum(){
        int sum =0;
        for(int i=0; i<size; i++){
            sum += stack[i];
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        stack = new int[N];

        for(int i=0; i<N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();

            if(command.equals("0")){
                pop();
            }else{
                push(Integer.parseInt(command));
            }
        }
        System.out.println(sum());
    }
}
