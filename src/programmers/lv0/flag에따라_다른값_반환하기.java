package programmers.lv0;

public class flag에따라_다른값_반환하기 {
  public int solution(int a, int b, boolean flag) {
    if(flag == true){
      return a + b;
    }else{
      return a -b;
    }

  }
  public static void main(String args[]){
    flag에따라_다른값_반환하기 sol = new flag에따라_다른값_반환하기();
    int result = sol.solution(-4,7,true);

    System.out.println(result);
  }


}
