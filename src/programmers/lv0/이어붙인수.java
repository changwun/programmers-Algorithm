package programmers.lv0;

public class 이어붙인수 {
  public int solution(int[] num_list) {
    int answer = 0;
    String odd = "";
    String even = "";
    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        even += Integer.toString(num_list[i]);
      } else {
        odd += Integer.toString(num_list[i]);
      }
    }
    answer = Integer.parseInt(even) + Integer.parseInt(odd);
    return answer;
  }
  public static void main(String args[]){
    이어붙인수 sol = new 이어붙인수();
    int[] result = {3,4,5,2,1};
    System.out.println(sol.solution(result));
  }
}
