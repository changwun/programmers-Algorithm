package programmers.lv0;

import java.util.Arrays;

public class 마지막_두원소 {
  public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length + 1];
    for(int i=0; i < num_list.length; i++){
      answer[i] = num_list[i];
    }
    if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
      answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
    }else{
      answer[num_list.length] = num_list[num_list.length - 1] * 2;
    }
    return answer;
  }

  public static void main(String[] args) {
    마지막_두원소 sol = new 마지막_두원소();
    int[] result = {2,1,6};
    System.out.println(Arrays.toString(sol.solution(result)));
  }

}
