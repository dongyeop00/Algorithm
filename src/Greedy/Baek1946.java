package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int TestCase = Integer.parseInt(bufferedReader.readLine());

        for (int t = 0; t < TestCase; t++) {
            int client = Integer.parseInt(bufferedReader.readLine());
            int[][] table = new int[client][2];

            for (int j = 0; j < client; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                table[j][0] = Integer.parseInt(stringTokenizer.nextToken()); // 서류 성적
                table[j][1] = Integer.parseInt(stringTokenizer.nextToken()); // 면접 성적
            }

            // 서류 성적을 기준으로 정렬
            Arrays.sort(table, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });

            int count = 1; // 서류 성적이 가장 높은 지원자는 무조건 선발
            int interview = table[0][1]; // 서류 성적이 가장 높은 지원자의 면접 순위를 기록

            // 면접 순위가 더 높은 지원자가 나오면 선발
            for (int i = 1; i < client; i++) {
                if (table[i][1] < interview) {
                    interview = table[i][1]; // 면접 순위 갱신
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

