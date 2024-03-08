# BufferedReader 와 Bufferedwriter

- BufferedReader : Scanner와 유사
- Bufferedwriter : System.out.println()과 유사

<br


# 동적 계획법 (Dynamic Programming)
https://www.acmicpc.net/step/16

### Step 1. Fibonacci

<details>
  <summary>재귀 호출과 동적 프로그래밍</summary>
  
  <br>
  
  재귀 호출
  ```
 public static int fin(int n){
        if(n==1 || n ==2) {
            cnt++;
            return 1;
        }
        else return (fin(n-1) + fin(n-2));
    }
  ```

  <br>

  동적 프로그래밍
  ```
    public static int fin2(int n){
        memo[0] = 1;
        memo[1] = 1;

        for(int i=2; i<n; i++){
            dpCnt++;
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n-1];
    }
  ```

  <br>

  실행 회수 비교
  ```
  입력 : 30
  재귀호출 : 832040
  동적 프로그래밍 : 28
  ```
</details>
