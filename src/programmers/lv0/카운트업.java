package programmers.lv0;

import java.util.Arrays;

public class 카운트업 {
    public int[] solution(int start_num, int end_num) {
      // 1. 결과 배열의 크기를 먼저 정합니다.
      int size = end_num - start_num + 1;
      int[] answer = new int[size];

      // 2. 숫자를 하나씩 채워 넣습니다.
      for (int i = 0; i < size; i++) {
        // i는 0, 1, 2... 순서대로 증가하고
        // 실제 들어갈 값은 start_num부터 시작합니다.
        answer[i] = start_num + i;
      }

      return answer;
    }

  public static void main(String[] args) {
    카운트업 sol = new 카운트업();
    int[] result = sol.solution(3,10);
    System.out.println(Arrays.toString(result));

  }
  }


