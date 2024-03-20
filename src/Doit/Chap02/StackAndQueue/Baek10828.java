package Doit.Chap02.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10828 {
    public static int[] stack;
    public static int size = 0;
    public static int maxSize;

    static void push(int n) {
        stack[size++] = n;
    }

    static int pop() {
        if (size() == 0) {
            return -1;
        } else {
            int item = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return item;
        }
    }

    static int top() {
        if (size() == 0) {
            return -1; // 스택이 비어있을 때
        }
        return stack[size - 1];
    }

    static int size() {
        return size;
    }

    static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stack = new int[N]; // 스택의 크기를 입력값 N으로 초기화
        maxSize = N;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            String command = stringTokenizer.nextToken();

            if (command.equals("push")) {
                int n = Integer.parseInt(stringTokenizer.nextToken());
                push(n);
            } else if (command.equals("pop")) {
                System.out.println(pop());
            } else if (command.equals("top")) {
                System.out.println(top());
            } else if (command.equals("size")) {
                System.out.println(size());
            } else if (command.equals("empty")) {
                System.out.println(empty());
            }
        }
    }
}
