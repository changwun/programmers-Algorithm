package programmers.lv0;

public class 주사위게임2 {
  public int solution(int a, int b, int c) {
//    방법1
//    int answer = 0;
//    if (a != b && a != c && b != c) {
//      answer = a + b + c;
//    } else if (a == b && a == c) {
//      answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
//    } else {
//      answer = (a + b + c) * (a * a + b * b + c * c);
//    }
//    return answer;
//  }

//    방법2
  int answer = a + b + c;

        if (a == b || b == c || a == c) {
    answer *= (a * a + b * b + c * c);
  }

        if (a == b && b == c) {
    answer *= (a * a * a + b * b * b + c * c * c);
  }

        return answer;
}
  public static void main(String args[]){
    주사위게임2 sol = new 주사위게임2();
    int result = sol.solution(2,6,1);
    System.out.println(result);
  }


}
