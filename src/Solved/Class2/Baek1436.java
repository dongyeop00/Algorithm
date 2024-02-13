package Solved.Class2;

import java.util.*;

public class Baek1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int num = 666;
        int n = sc.nextInt();

        while(count != n){
            num++;
            if(String.valueOf(num).contains("666"))
                count++;
        }
        System.out.println(num);
        sc.close();
    }
}
