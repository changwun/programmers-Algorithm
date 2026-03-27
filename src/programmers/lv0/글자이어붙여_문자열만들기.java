package programmers.lv0;

public class 글자이어붙여_문자열만들기 {
    public String solution(String my_string, int[] index_list) {
      StringBuilder answer = new StringBuilder();
      for(int i=0; i < index_list.length; i++){
        int index = index_list[i];

        char c = my_string.charAt(index);

        answer.append(c);

      }


      return answer.toString();
    }

  public static void main(String[] args) {
    글자이어붙여_문자열만들기 sol = new 글자이어붙여_문자열만들기();
    int[] result = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
    System.out.println(sol.solution("cvsgiorszzzmrpaqpe",result));
  }
  }


