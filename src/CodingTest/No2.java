package CodingTest;
/*
        arr = [1, 2, 2, 3, 4]
        low = [0, 2]
        high = [2, 4]
        쿼리는 인덱스별로 정렬됩니다.
        0. low = 0, high = 2: 범위에는 [1, 2, 2]의 3개 요소가 있습니다.
        1. low = 2, high = 4: 범위에는 [2, 2, 3, 4]의 4개 요소가 있습니다.
        쿼리와 그에 대한 답을 인덱스로 정렬된 배열로 반환: [3, 4].
        제약 조건:
        • 1 ≤ n ≤ 105
        • 1 ≤ arr[j] ≤ 109
        • 1 ≤ low[i], high[i] ≤ 109

*/
import java.io.*;
import java.util.*;

class re {

    public static List<Integer> countBetween(List<Integer> arr, List<Integer> low, List<Integer> high) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < low.size(); i++) {
            int count = 0;
            int start = low.get(i);
            int end = high.get(i);

            for (int num : arr) {
                if (num >= start && num <= end) {
                    count++;
                }
            }

            result.add(count);
        }

        return result;
    }
}

public class No2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int lowCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> low = new ArrayList<>();

        for (int i = 0; i < lowCount; i++) {
            int lowItem = Integer.parseInt(bufferedReader.readLine().trim());
            low.add(lowItem);
        }

        int highCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> high = new ArrayList<>();

        for (int i = 0; i < highCount; i++) {
            int highItem = Integer.parseInt(bufferedReader.readLine().trim());
            high.add(highItem);
        }

        List<Integer> result = re.countBetween(arr, low, high);

        // 파일 경로가 null이 아니라면 파일에 결과 출력, null이면 콘솔에 출력
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath != null) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write("\n");
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } else {
            System.out.println(result);
        }

        bufferedReader.close();
    }
}


