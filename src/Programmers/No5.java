package Programmers;

import java.util.Arrays;

public class No5 {

    static long solution(int price, int money, int count){
        long answer = -1;
        for(int i=0; i< count; i++){
            price += price;
        }
        return -1;
    }
    public static void main(String[] args) {
        int money = 20;
        int price = 3;
        int count = 4;
        int sum=0;
        int num=0;

        for(int i=0; i < count; i++){
            num += price;
            sum += num;
        }

        System.out.println(sum);
    }
}
