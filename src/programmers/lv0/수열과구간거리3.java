package programmers.lv0;
import java.util.Arrays;

public class 수열과구간거리3 {

   public int[] solution(int[] arr, int[][] queries) {
      // 1. 명령서(queries)를 하나씩 꺼냅니다.
      for (int[] query : queries) {
        int i = query[0]; // 바꿀 첫 번째 인덱스
        int j = query[1]; // 바꿀 두 번째 인덱스

        // 2. 임시 변수(temp)를 사용하여 arr[i]와 arr[j]의 값을 바꿉니다.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }

      // 3. 모든 쿼리를 처리한 후 변경된 arr를 반환합니다.
      return arr;
    }

    public static void main(String[] args) {
      수열과구간거리3 sol = new 수열과구간거리3();
      int[] arr = {0, 1, 2, 3, 4};
      int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

      int[] result = sol.solution(arr, queries);
      System.out.println(Arrays.toString(result)); // 출력: [3, 4, 1, 0, 2]
    }
  }


