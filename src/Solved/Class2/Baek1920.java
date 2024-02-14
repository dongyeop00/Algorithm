package Solved.Class2;

import java.util.Arrays;
import java.util.Scanner;

// 4 1 5 2 3 => 1 2 3 4 5
// 1 3 7 9 5 => 1 3 5 7 9
public class Baek1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Narr = new int[N];
        for(int i=0; i<N; i++){
            Narr[i] = sc.nextInt();
        }

        int M = sc.nextInt();



        Arrays.sort(Narr);

        for(int i=0; i<M; i++){
            int Mnum = sc.nextInt();
            int answer = Arrays.binarySearch(Narr,Mnum);

            if(answer<0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
        sc.close();
    }
}
