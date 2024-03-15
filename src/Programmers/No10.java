package Programmers;

import java.util.Arrays;

// 예산 문제

public class No10 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int count = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget < 0){
                break;
            }
            count++;
        }

        System.out.println(Arrays.toString(d));
        System.out.println(count);
    }
}
