package programmers.lv0;

public class 구로나눈나머지 {
    public int solution(String number) {
      int sum = 0;

      // 1. 문자열의 처음부터 끝까지 한 글자씩 확인합니다.
      for (int i = 0; i < number.length(); i++) {
        // 2. 해당 위치의 문자(char)를 가져옵니다.
        char c = number.charAt(i);

        // 3. 문자를 숫자로 변환하여 합계에 더합니다.
        // 0을 배서 문자열을 숫자로 만들어줌
        sum += (c - '0');
      }

      // 4. 모든 자릿수의 합을 9로 나눈 나머지를 반환합니다.
      return sum % 9;
    }

  public static void main(String[] args) {
    구로나눈나머지 sol = new 구로나눈나머지();
    int result = sol.solution("123");
    System.out.println(result);
  }
  }

