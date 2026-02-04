package programmers.lv0;

import java.util.Arrays;

public class 수열과구간거리2 {
    public int[] solution(int[] arr, int[][] queries) {
      int[] answer = new int[queries.length];
      for (int i = 0; i < queries.length; i++) {
        int s = queries[i][0];
        int e = queries[i][1];
        int k = queries[i][2];
        int min = Integer.MAX_VALUE;
        for (int j = s; j <= e; j++) {
          if (arr[j] < min && k < arr[j]) {
            min = arr[j];
          }
        }
        if (min != Integer.MAX_VALUE) {
          answer[i] = min;
        } else {
          answer[i] = -1;
        }
      }
      return answer;
    }

  public static void main(String[] args) {
    수열과구간거리2 sol = new 수열과구간거리2();
    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

    int[] result = sol.solution(arr, queries);
    System.out.println(Arrays.toString(result)); // 출력: [3, 4, 1, 0, 2]
  }
  }


