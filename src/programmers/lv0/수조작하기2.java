package programmers.lv0;

public class 수조작하기2 {

//  public String solution(int[] numLog) {
//    String answer = "";
//    for(int i = 1; i < numLog.length; i++){
//      if(numLog[i] - numLog[i - 1] == 1)
//        answer += 'w';
//      else if(numLog[i] - numLog[i - 1] == -1)
//        answer += 's';
//      else if (numLog[i] - numLog[i - 1] == 10)
//        answer += 'd';
//      else
//        answer += 'a';
//    }
//    return answer;
//  }
public String solution(int[] numLog) {
  StringBuilder sb = new StringBuilder(); // 문자열을 효율적으로 이어붙이는 도구

  for(int i = 1; i < numLog.length; i++) {
    int diff = numLog[i] - numLog[i - 1]; // 차이값을 미리 계산해두면 깔끔합니다.

    if(diff == 1) sb.append('w');
    else if(diff == -1) sb.append('s');
    else if(diff == 10) sb.append('d');
    else if(diff == -10) sb.append('a');
  }

  return sb.toString();
}
  public static void main(String[] args) {
    수조작하기2 sol = new 수조작하기2();
    int[] result = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
    System.out.println(sol.solution(result));

  }
}
