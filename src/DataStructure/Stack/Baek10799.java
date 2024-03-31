package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Baek10799 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bar = scanner.next();
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < bar.length(); i++) {
            if(bar.charAt(i) == '(') {
                stack.push(bar.charAt(i));
            }else {    //) 라면
                if(bar.charAt(i-1) == '(') {    // 레이저
                    stack.pop();
                    count += stack.size();
                }else {    // 그냥 쇠막대기 끝남
                    stack.pop();
                    count += 1;    // 조각 1개 추가
                }
            }
        }

        System.out.println(count);
    }
}
