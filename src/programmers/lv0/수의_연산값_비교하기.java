package programmers.lv0;

public class 수의_연산값_비교하기 {
    public int solution(int a, int b) {
      int answer = Math.max(Integer.parseInt(a + "" + b), 2 * a * b);
      return answer;

  }

  public static void main(String[] args){
    수의_연산값_비교하기 sol = new 수의_연산값_비교하기();

    int result = sol.solution(2,91);

    System.out.println(result);
  }

}
