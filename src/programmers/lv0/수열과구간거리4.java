package programmers.lv0;

import java.util.Arrays;

public class 수열과구간거리4 {
    public int[] solution(int[] arr, int[][] queries) {
      for (int[] query : queries) {
        int s = query[0];
        int e = query[1];
        int k = query[2];

        for (int i = s; i <= e; i++) {
          // k가 0인 경우를 대비한 안전한 처리 (문제 조건에 따라 0 체크 필요)
          if (k == 0) {
            if (i == 0) arr[i]++;
            continue;
          }

          // 인덱스 i가 k의 배수인지 확인
          if (i % k == 0) {
            arr[i]++;
          }
        }
      }
      return arr;
    }

  public static void main(String[] args) {
    수열과구간거리4 sol = new 수열과구간거리4();
    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

    int[] result = sol.solution(arr, queries);
    System.out.println(Arrays.toString(result));
  }

    }



