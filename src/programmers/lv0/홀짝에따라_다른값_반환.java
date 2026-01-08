package programmers.lv0;

public class 홀짝에따라_다른값_반환 {
  public int solution(int n) {
    int answer = 0;

    if(n % 2 == 1){
      for(int i=1; i<=n; i+=2){
        answer += i;
      }
    }else {
      for(int i=2; i<=n; i+=2)
        answer += i*i;
    }
    return answer;
  }

  public static void main(String[] args) {
    홀짝에따라_다른값_반환 sol = new 홀짝에따라_다른값_반환();

    int result = sol.solution(10);
    System.out.println(result);
  }

}
