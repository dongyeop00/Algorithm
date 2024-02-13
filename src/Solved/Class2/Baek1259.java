package Solved.Class2;

import java.util.*;

//배열의 가운데꺼 빼고 역순으로 정렬해서 비교하기
//ex) 1234321 => 4제거 123 / 321
public class Baek1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        while(true){
            str = sc.next();

            if(str.equals("0")){
                break;
            }

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == str.charAt(str.length()-i)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
        sc.close();
    }
}
