package programmers.lv0;

 public class 등차수열의_특정항만_더하기 {
  public int solution(int a, int d, boolean[] included) {
  int answer = 0;
  for (int i=0; i <included.length; i++ ){
    int currentTerm = a + (i*d);

    if (included[i]){
      answer += currentTerm;
    }
  }
  return answer;
  }
  public static void main(String args[]){
  등차수열의_특정항만_더하기 sol = new 등차수열의_특정항만_더하기();
  boolean[] included1 = {true, false, false, true, true};
  System.out.println(sol.solution(3,4,included1));
}
}
