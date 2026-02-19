package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기4 {

    public int[] solution(int[] arr) {
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
        if (list.isEmpty()) {
          list.add(arr[i]);
        } else if (list.get(list.size() - 1) < arr[i]) {
          list.add(arr[i]);
        } else {
          list.remove(list.size() - 1);
          i--;
        }
      }
      int[] stk = new int[list.size()];
      int index = 0;
      for (int i = 0; i < list.size(); i++) {
        stk[index++] = list.get(i);
      }
      return stk;
    }

  public static void main(String[] args) {
    배열만들기4 sol = new 배열만들기4();

    // 1. 테스트할 입력 배열 (문제 예시와 동일)
    int[] input = {1, 4, 2, 5, 3};

    // 2. solution 메소드 실행 결과를 result 변수에 저장
    int[] result = sol.solution(input);

    // 3. 🚨 중요: 배열의 내용물을 보기 위해 Arrays.toString() 사용
    System.out.println("최종 stk 결과: " + Arrays.toString(result));
  }
  }


