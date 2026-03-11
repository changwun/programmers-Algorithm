package programmers.lv0;
import java.util.*;

public class 조건문과리스트 {

    public int[] solution(int n) {
      List<Integer> list = new ArrayList<>();

      for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) { // 홀수 조건
          list.add(i);
        }
      }

      // 리스트를 배열로 변환
      return list.stream().mapToInt(Integer::intValue).toArray();
    }

  }

