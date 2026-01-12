package programmers.lv0;

public class 조건문자열 {

  public int solution(String ineq, String eq, int n, int m) {
    if (n < m) {
      return ineq.equals("<") ? 1 : 0;
    } else if (n > m) {
      return ineq.equals(">") ? 1 : 0;
    }else {
      return eq.equals("=") ? 1: 0;
    }
  }

  public static void main(String[] args) {
    조건문자열 sol = new 조건문자열();

    int result = sol.solution("<", "=", 20, 50);

    System.out.println(result);
  }
}
