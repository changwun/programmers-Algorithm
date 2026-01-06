package programmers.lv0;

public class 공배수 {
  public int solution(int number, int n, int m) {
    int answer = 0;
    if(number % n == 0 && number % m == 0){
      return 1;
    }else{
      return answer;
    }

  }

  public static void main(String[] args) {
    공배수 sol = new 공배수();

    int result = sol.solution(60,2,3);
    System.out.println(result);
  }

}
