package programmers.lv0;

import java.lang.reflect.Array;
import java.util.*;

public class 배열만들기2 {

    public int[] solution(int l, int r) {
      List<Integer> list = new ArrayList<>();

      for(int i =l; i<=r; i++){
        if(isOnlyZeroFive(i)){
          list.add(i);
        }
      }

      if(list.isEmpty()){
        return new int[]{-1};
      }
      int[] answer = new int[list.size()];
      for(int i=0; i<list.size(); i++){
        answer[i] = list.get(i);
      }
      return answer;
    }

    private boolean isOnlyZeroFive(int num){
      String s = String.valueOf(num);
      for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(c != '0' && c != '5'){
          return false;
        }
      }
      return true;
    }

  public static void main(String[] args) {
    배열만들기2 sol = new 배열만들기2();
    int[] result = sol.solution(5, 555);
    System.out.println(Arrays.toString(result));
  }
  }


