package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 마지막_두원소 {
  public int[] solution(int[] num_list) {
//    int[] answer = new int[num_list.length + 1];
//    int last = num_list[num_list.length -1];
//    int lastBefore = num_list[num_list.length -2];
//
//    for(int i=0; i < num_list.length; i++){
//      answer[i] = num_list[i];
//    }
//    if(last > lastBefore){
//      answer[num_list.length] = last - lastBefore;
//    }else{
//      answer[num_list.length] = last * 2;
//    }
//    return answer;
//  }
    List<Integer> answer = new ArrayList<>();
    int last = num_list[num_list.length - 1];
    int lastBefore = num_list[num_list.length - 2];

    for (int i = 0; i < num_list.length; i++) {
      answer.add(num_list[i]);
    }
    if (last > lastBefore) {
      answer.add(last - lastBefore);
    } else {
      answer.add(last * 2);
    }
    int[] result = new int[answer.size()];
    for (int i = 0; i < answer.size(); i++) {
      result[i] = answer.get(i);
    }
    return result;
  }
  public static void main(String[] args) {
    마지막_두원소 sol = new 마지막_두원소();
    int[] input = {2,1,6};
    System.out.println(Arrays.toString(sol.solution(input)));
  }

}
