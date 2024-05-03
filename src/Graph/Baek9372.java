package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int TestCase = Integer.parseInt(stringTokenizer.nextToken());

        for(int i=0; i<TestCase; i++){
            int a,b;
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());

            for(int j=0; j<b; j++){
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            }
            System.out.println(a-1);
        }
    }
}
