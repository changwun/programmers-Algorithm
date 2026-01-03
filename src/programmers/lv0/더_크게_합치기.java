package programmers.lv0;

public class 더_크게_합치기 {

  public int solution(int a, int b) {

    String ab = String.valueOf(a) + String.valueOf(b);
    String ba = String.valueOf(b) + String.valueOf(a);

    if(Integer.parseInt(ab) >= Integer.parseInt(ba)){
      return Integer.parseInt(ab);
    }else{
      return Integer.parseInt(ba);
    }

  }

  public static void main(String[] args) {
    더_크게_합치기 sol = new 더_크게_합치기();

    int result = sol.solution(9,91);

    System.out.println(result);

  }

}
