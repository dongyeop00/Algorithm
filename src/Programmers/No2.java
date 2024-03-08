package Programmers;

public class No2 {

    public static String solution(String phone_number){
        String answer="";
        for(int i=0; i<phone_number.length(); i++){
            if(i<phone_number.length()-4){
                answer+="*";
            }else{
                answer+=phone_number.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String phone_number = "01025419466";
        System.out.println(solution(phone_number));
    }
}
