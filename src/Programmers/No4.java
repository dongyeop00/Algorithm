package Programmers;

public class No4 {

    public static String solution(String s){
        String answer = "";
        int length = s.length();
        int index = length/2;

        if(length % 2 == 0){
            answer += s.charAt(index-1);
            answer += s.charAt(index);
        }else{
            answer += s.charAt(index);
        }


        return answer;
    }
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }
}
