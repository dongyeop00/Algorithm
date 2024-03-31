package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Baek11899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        String str = sc.next();

        char[] chr = str.toCharArray();

        int count = 0;

        stack.push(chr[0]);

        for(int i=1; i<chr.length; i++){
            if(chr[i] == '('){
                stack.push(chr[i]);
            }else{
                if(stack.size() > 0 && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(chr[i]);
                }
            }
        }

        count = stack.size();

        System.out.println(count);
    }
}
