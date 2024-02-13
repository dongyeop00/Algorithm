package Solved.Class1;

import java.util.Scanner;

public class Baek2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        for(int i=0; i< 8; i++){
            str += sc.next();
        }

        if(str.equals("12345678")){
            System.out.println("ascending");
        }else if(str.equals("87654321")){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }



    }
}
