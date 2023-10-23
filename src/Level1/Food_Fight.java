package Level1;

public class Food_Fight {
    class Solution {
        public String solution(int[] food) {
            String answer = "";
            String front = "";
            String back = "";

            // food의 길이 만큼 실행한다
            for(int i = 1; i < food.length; i++) {
                // food[i] < 2 일 때 continue
                if(food[i] < 2)
                    continue;
                // 0부터 food[i] / 2 까지 반복
                for(int j = 0; j < food[i] / 2; j++) {
                    // 문자열을 더한다
                    front = front + i;
                    // 문자열을 더한다
                    back = i + back;
                }
            }
            // 두 문자열을 0을 사이에 넣고 더한다
            answer = front+"0"+back;

            return answer;
        }
    }
}
