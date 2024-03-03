package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class No1 {
    static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()){
            return new int[] {-1};
        }else{
            int[] answer = new int[list.size()];

            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] result = solution(arr,divisor);
        System.out.println(Arrays.toString(result));
    }
}
