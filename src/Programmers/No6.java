package Programmers;

import java.util.Arrays;

public class No6 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = new int[arr.length];
        int idx = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                continue;
            } else {
                answer[idx++] = arr[i];
            }
        }

        answer[idx] = arr[arr.length - 1];
        int[] result = Arrays.copyOf(answer, idx + 1);

        System.out.println(Arrays.toString(result));
    }
}
