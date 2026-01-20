package programmers.lv0;

public class 배열들의곱과합 {

    public int solution(int[] num_list) {
      int sum = 0; // 원소들의 합을 저장할 변수
      int mul = 1; // 원소들의 곱을 저장할 변수 (곱셈이므로 1로 초기화)

      // 배열의 모든 원소를 순회하며 합과 곱을 계산
      for (int num : num_list) {
        sum += num;
        mul *= num;
      }

      // 원소들의 곱이 합의 제곱보다 작은지 확인
      if (mul < (sum * sum)) {
        return 1; // 작으면 1 반환
      } else {
        return 0; // 크거나 같으면 0 반환
      }
    }

    public static void main(String args[]){
      배열들의곱과합 sol = new 배열들의곱과합();
      int[] input = {3, 4, 5, 2, 1};

      // 2. 생성한 배열을 메소드에 전달하고, 결과값(int)을 받습니다.
      int result = sol.solution(input);
      System.out.println(result);

}
  }



