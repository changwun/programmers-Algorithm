package programmers.lv0;

public class 문자열여러번뒤집기 {
    public String solution(String my_string, int[][] queries) {
      StringBuilder sb = new StringBuilder(my_string);

      for(int[] query : queries){
        int s = query[0];
        int e = query[1];

        String sub = sb.substring(s, e+1);

        StringBuilder temp = new StringBuilder(sub);
        String reversed = temp.reverse().toString();

        sb.replace(s, e+1, reversed);
      }
      return sb.toString();

  }

  public static void main(String[] args) {
    문자열여러번뒤집기 sol = new 문자열여러번뒤집기();
    String my_string = "rermgorpsam";
    int[][] queries = {
        {2, 3},
        {0, 7},
        {5, 9},
        {6, 10}
    };
    System.out.println(sol.solution(my_string, queries));
  }

}
