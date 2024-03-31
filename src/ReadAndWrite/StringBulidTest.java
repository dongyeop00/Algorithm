package ReadAndWrite;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringBulidTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("안녕\n");
        System.out.println(stringBuilder.toString());
    }
}
