package Algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek16953 {
    static Long A, B;
    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(BFS());
    }

    //2 162
    public static int BFS() {
        Queue<Long> queue = new LinkedList<>();
        queue.add(A);
        count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Long num = queue.poll();

                if (num == B) return count+1;

                if (num * 2 <= B) queue.add(num * 2);

                if (num * 10 + 1 <= B) queue.add(num * 10 + 1);
            }
            count++;

        }

        return -1;
    }
}
