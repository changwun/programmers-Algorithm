package programmers.lv0;

public class 대문자로바꾸기 {
    public String solution(String myString) {
      String answer = "";
      answer = myString.toUpperCase();
      return answer;

    }

  public static void main(String[] args) {
    대문자로바꾸기 sol = new 대문자로바꾸기();
    String result = sol.solution("aBcDeFg");
    System.out.println(result);
  }
  }


