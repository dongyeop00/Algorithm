import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        //BufferedReader : 데이터를 라인 단위로 읽기 위해 사용, 잘라서 배열과 같이 인덱스로 접근하여 사용
        //StringTokenizer : 구분자를 기반으로 토큰을 분리하기 위한 도구, 문자열의 공백 자리를 땡겨 채운다(nextToken())
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //따로 따로 받으려면 n과 m 사이에 stringTokenizer 객체를 새로 생성해야됨
        int k = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("k = " + k);
    }
}
