package programmers.lv0;
import java.util.*;

public class 배열만들기2 {

//    public int[] solution(int l, int r) {
//      List<Integer> list = new ArrayList<>();
//
//      for(int i =l; i<=r; i++){
//        if(isOnlyZeroFive(i)){
//          list.add(i);
//        }
//      }
//
//      if(list.isEmpty()){
//        return new int[]{-1};
//      }
//      int[] answer = new int[list.size()];
//      for(int i=0; i<list.size(); i++){
//        answer[i] = list.get(i);
//      }
//      return answer;
//    }
//
//    private boolean isOnlyZeroFive(int num){
//      String s = String.valueOf(num);
//      for(int i = 0; i < s.length(); i++){
//        char c = s.charAt(i);
//        if(c != '0' && c != '5'){
//          return false;
//        }
//      }
//      return true;
//    }
//
//  public static void main(String[] args) {
//    배열만들기2 sol = new 배열만들기2();
//    int[] result = sol.solution(5, 555);
//    System.out.println(Arrays.toString(result));
//  }
public int[] solution(int l, int r) {
  List<Integer> list = new ArrayList<>();

  for (int i = l; i <= r; i++) {
    // 1. 숫자를 문자열로 바꾸고 바로 조건을 확인합니다.
    // "^[05]+$"의 의미: 시작(^)부터 끝($)까지 0 또는 5([05])가 1개 이상(+) 반복된다.
    if (String.valueOf(i).matches("^[05]+$")) {
      list.add(i);
    }
  }

  // 2. 비어있을 때 처리
  if (list.isEmpty()) return new int[]{-1};

  // 3. 리스트를 배열로 변환 (Java 8 이상이라면 스트림으로 한 줄 처리 가능!)
  return list.stream().mapToInt(Integer::intValue).toArray();
}
//  public static void main(String[] args) {
//    배열만들기2 sol = new 배열만들기2();
//    int[] result = sol.solution(5, 555);
//    System.out.println(Arrays.toString(result));
//  }
}



