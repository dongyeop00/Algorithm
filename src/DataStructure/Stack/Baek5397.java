package DataStructure.Stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());


        int testcase = Integer.parseInt(stringTokenizer.nextToken());

        for(int i=0; i<testcase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String password = stringTokenizer.nextToken();
            Stack<Character> key = new Stack<>();
            Stack<Character> delete = new Stack<>();

            for(int j=0; j<password.length(); j++){
                if(password.charAt(j) == '<'){
                    if(!key.isEmpty()){
                        delete.push(key.pop());
                    }
                }else if(password.charAt(j) == '>'){
                    if(!delete.isEmpty()){
                        key.push(delete.pop());
                    }
                }else if(password.charAt(j) == '-'){
                    if(!key.isEmpty()){
                        key.pop();
                    }
                }else{
                    key.push(password.charAt(j));
                }
            }
            while(!delete.isEmpty()){
                key.push(delete.pop());
            }

            for(int k=0; k<key.size(); k++){
                bufferedWriter.write(key.get(k));
            }
            bufferedWriter.write("\n");

        }

        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
