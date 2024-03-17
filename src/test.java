
public class test {
    public static void main(String[] args){
        int n = 100000;
        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++) {
                System.out.println("연산 횟수 :" + cnt++);
            }
        }

    }
}
