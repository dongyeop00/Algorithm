package Programmers;

import java.util.Arrays;

public class No3 {

    public static int[] solution(int[] arr){
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int index = 0;

        if(arr.length == 1){
            return new int[] {-1};
        }

        for(int i : arr){
            min = Math.min(min, i);
        }

        for(int i = 0; i < arr.length; i++){
            if(min == arr[i])
                continue;
            else
                answer[i] = arr[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println((Arrays.toString(solution(arr))));
    }
}
