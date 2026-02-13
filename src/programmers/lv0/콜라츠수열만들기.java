package programmers.lv0;
import java.util.ArrayList;
import java.util.Arrays;

public class 콜라츠수열만들기 {


    public int[] solution(int n) {
      ArrayList<Integer> list = new ArrayList<>();
      while (n > 1) {
        list.add(n);
        if (n % 2 == 0) {
          n /= 2;
        } else {
          n = 3 * n + 1;
        }
      }
      list.add(1);

      int[] answer = new int[list.size()];
      int index = 0;
      for (int num: list) {
        answer[index++] = num;
      }
      return answer;
    }

  public static void main(String[] args) {
    콜라츠수열만들기 sol = new 콜라츠수열만들기();
    int[] result = sol.solution(10);
    System.out.println(Arrays.toString(result));
  }
  }


