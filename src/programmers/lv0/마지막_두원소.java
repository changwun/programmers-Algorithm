package programmers.lv0;

import java.util.Arrays;

public class 마지막_두원소 {
  public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length + 1];
    int last = num_list[num_list.length -1];
    int lastBefore = num_list[num_list.length -2];

    for(int i=0; i < num_list.length; i++){
      answer[i] = num_list[i];
    }
    if(last > lastBefore){
      answer[num_list.length] = last - lastBefore;
    }else{
      answer[num_list.length] = last * 2;
    }
    return answer;
  }

  public static void main(String[] args) {
    마지막_두원소 sol = new 마지막_두원소();
    int[] result = {2,1,6};
    System.out.println(Arrays.toString(sol.solution(result)));
  }

}
