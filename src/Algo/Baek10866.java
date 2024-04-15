package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class Baek10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        int testcase = Integer.parseInt(stringTokenizer.nextToken());


        while(testcase --> 0){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();

            if(command.equals("push_front")){
                int n = Integer.parseInt(stringTokenizer.nextToken());
                deque.addFirst(n);
            }else if(command.equals("push_back")){
                int n = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(n);
            }else if(command.equals("pop_front")){
                if(!deque.isEmpty()){
                    stringBuilder.append(deque.remove() + "\n");
                }else{
                    stringBuilder.append("-1\n");
                }
            }else if(command.equals("pop_back")){
                if(!deque.isEmpty()){
                    stringBuilder.append(deque.removeLast() + "\n");
                }else{
                    stringBuilder.append("-1\n");
                }
            }else if(command.equals("size")){
                stringBuilder.append(deque.size() + "\n");
            }else if(command.equals("empty")){
                if(!deque.isEmpty()){
                    stringBuilder.append("0\n");
                }else{
                    stringBuilder.append("1\n");
                }
            }else if(command.equals("front")){
                if(!deque.isEmpty()){
                    stringBuilder.append(deque.getFirst() + "\n");
                }else{
                    stringBuilder.append("-1\n");
                }
            }else if(command.equals("back")){
                if(!deque.isEmpty()){
                    stringBuilder.append(deque.getLast() + "\n");
                }else{
                    stringBuilder.append("-1\n");
                }
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
