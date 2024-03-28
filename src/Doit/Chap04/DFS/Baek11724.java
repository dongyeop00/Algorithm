package Doit.Chap04.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek11724 {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        //인접 리스트 초기화 하기
        for(int i=1; i<n+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        //인접 리스트 값 추가
        for(int i=0; i<m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;


        for(int i=1; i<n+1; i++){
            if(!visited[i]){ // 방문하지 않은 노드가 없을 때 까지 반복 //2는 방문 했으니 3간다~
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v){ //1입력
        if(visited[v]){ //없으니깐 계속
            return;
        }
        visited[v] = true; //1 방문 => true 변경 //2방문 => true 변경 // 5방문 =>true변경
        for(int i : A[v]){ //A[1] = [2,5] //2먼저 방문 // 5방문 끝 // A[3] = [4] // A[4] = [3,6]
            if(visited[i] == false){ //2방문간다~ //5방문 간다~
                DFS(i);
            }
        }
    }
}
