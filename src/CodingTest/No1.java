package CodingTest;

import java.io.*;
import java.util.*;

class Result {

    public static int maxTrailing(List<Integer> arr) {
        int maxTrailing = -1; // 초기값을 -1로 설정

        if (arr == null || arr.size() <= 1) {
            return maxTrailing; // 배열이 비어 있거나 하나의 요소만 있는 경우 최대 후행 레코드가 없음
        }

        int[] minBefore = new int[arr.size()]; // 각 요소의 이전 작은 값 저장 배열

        minBefore[0] = arr.get(0);

        // 각 요소의 이전 작은 값 찾기
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) < minBefore[i - 1]) {
                minBefore[i] = arr.get(i - 1);
            } else {
                minBefore[i] = minBefore[i - 1];
            }
        }

        // 최대 후행 레코드 찾기
        for (int i = arr.size() - 1; i >= 1; i--) {
            int diff = arr.get(i) - minBefore[i];
            maxTrailing = Math.max(maxTrailing, diff);
        }

        return maxTrailing;
    }
}

public class No1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.maxTrailing(arr);

        // 파일 경로가 null이 아니라면 파일에 결과 출력, null이면 콘솔에 출력
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath != null) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } else {
            System.out.println(result);
        }

        bufferedReader.close();
    }
}
