package Doit.Chap02.SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek12891 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int S = Integer.parseInt(stringTokenizer.nextToken()); // 4
        int P = Integer.parseInt(stringTokenizer.nextToken()); // 2
        int count = 0;

        char[] DNA = new char[S]; // GATA
        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr = new int[4]; // 현재 상태 배열
        checkSecret = 0; // 몇 개의 문자와 관련된 개수를 충족했는지 판단

        DNA = bufferedReader.readLine().toCharArray();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<4; i++){
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken()); // 1 0 0 1
            if(checkArr[i] == 0){ //비밀번호가 0개 이상일 때는 있거나 말거나이므로 checkSecret 값을 ++ 해준다.
                checkSecret++;
            }
        }

        for(int i=0; i<P; i++){
            add(DNA[i]);
        }

        if(checkSecret==4){
            count++;
        }

        //슬라이딩 윈도우 처리 부분
        for(int i=P; i<S; i++){ // 2 ~ 4까지
            int index = i - P; // 1. 2-2=0 / 2. 3-2=1 / 3. 4-2=2
            add(DNA[i]); //신규로 채워지는 인덱스
            remove(DNA[index]); //기존 윈도우의 맨 앞 배열
            if(checkSecret == 4){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void add(char c){
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                }
                break;
        }
    }

    private static void remove(char c){
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]){
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]){
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]){
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]){
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }
}
