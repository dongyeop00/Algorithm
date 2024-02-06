package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,6,5);
        List<Integer> b = Arrays.asList(7,6,4,1,2,1);
        List<Integer> arr = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        int count=-2;

        for(int i=0; i<a.size(); i++){
            arr.add(b.get(i));
            arr.add(a.get(i));
        }
        System.out.println(arr);
        System.out.println(arr.size()); //12

        num.add(arr.get(0));
        num.add(arr.get(1));


        for(int i=0; i<num.size(); i++){
            for(int j=0; j<arr.size()-1; j+=2){
                if(num.get(i) == arr.get(j)){
                    System.out.println("값 : " + arr.get(j) +" 인덱스 : "+ j + "의존 노드 : " + arr.get(j+1));
                }
            }
        }
        System.out.println("2num : " + num);

        arr.removeAll(num);
        System.out.println(arr);
        System.out.println(arr.size()/2);
        System.out.println(7-(7/arr.size()));
    }
}
