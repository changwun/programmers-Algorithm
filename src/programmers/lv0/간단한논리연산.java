package programmers.lv0;

public class 간단한논리연산 {
  public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

    return (x1 || x2) && (x3 || x4);
  }

  public static void main(String[] args) {
    간단한논리연산 sol = new 간단한논리연산();
    boolean result = sol.solution(false,	true,	true,	true);
    System.out.println(result);
  }
}
