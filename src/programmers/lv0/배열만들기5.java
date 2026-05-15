package programmers.lv0;
import java.util.*;

public class 배열만들기5 {

    public int[] solution(String[] intStrs, int k, int s, int l) {
      List<Integer> resultList = new ArrayList<>();

      for (String str : intStrs){
        String sub = str.substring(s, s + l);

        int num = Integer.parseInt(sub);

        if(num > k){
          resultList.add(num);
        }
      }

      int[] answer = new int[resultList.size()];
      for (int i = 0; i < resultList.size(); i++) {
        answer[i] = resultList.get(i);
      }

      return answer;
    }

  public static void main(String[] args) {
    배열만들기5 sol = new 배열만들기5();

    String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
    int k = 50000;
    int s = 5;
    int l = 5;

    int[] result = sol.solution(intStrs,k,s,l);
    System.out.print("결과: [");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i == result.length - 1 ? "" : ", "));
    }
    System.out.println("]");
  }

  }


