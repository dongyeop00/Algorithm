package Programmers;

public class No9 {

    public static int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int result = 0;

        for(int i=0; i< t.length() - len + 1; i++) {
            long diff = Long.parseLong(t.substring(i,i+len));
            if(diff <=num){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(solution("3141592","271"));
    }
}
