package programmers.lv0;

public class 코드처리하기 {

    public String solution(String code) {
      StringBuilder ret = new StringBuilder();
      int mode = 0; // 시작 모드는 0

      for(int idx =0; idx < code.length(); idx++){
        char current = code.charAt(idx);

        if(current == '1'){
          mode = (mode == 0) ? 1: 0;
        }
        else{
          if(mode==0){
            if(idx % 2 ==0){
              ret.append(current);
            }
          }else{
            if(idx % 2 != 0){
              ret.append(current);
            }
          }
        }
      }
      if(ret.length() == 0){
        return "EMPTY";
      }else{
        return ret.toString();
      }
    }

  public static void main(String args[]){
    코드처리하기 sol = new 코드처리하기();
    String result = sol.solution("abc1abc1abc");

    System.out.println(result);
  }

}
