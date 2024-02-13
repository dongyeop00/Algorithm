package Solved.Class2;

import java.util.*;

public class Baek1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";


        while(true){
            boolean check = true;
            str = sc.next();

            if(str.equals("0")){
                break;
            }

            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i))
                    check = false;
            }

            if(check)
                System.out.println("no");
            else
                System.out.println("yse");
        }
        sc.close();
    }
}
