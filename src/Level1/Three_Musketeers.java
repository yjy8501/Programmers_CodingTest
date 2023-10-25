package Level1;

import java.util.ArrayList;
import java.util.List;

public class Three_Musketeers {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            // 5C3 == 0, 중복 X이 되는 경우
            // number만큼 반복
            List<Integer> arr = new ArrayList<>();

            // 배열, 깊이, 문자열, 방문여부, 정답, 시작 위치
            answer = combine(number, 3, arr, answer, 0);

            return answer;
        }

        public int combine(int[] number, int dept, List<Integer> arr, int answer,
                           int start) {
            // 끝에 도달했을 시
            if(dept == 0) {
                int sum = arr.stream().mapToInt(Integer::intValue).sum();
                arr.stream().forEach(System.out::print);
                System.out.println();
                if(sum == 0)
                    answer++;
                return answer;
            }

            for(int i = start; i < number.length; i++) {
                arr.add(number[i]);
                answer = combine(number, dept-1, arr, answer, i+1);
                arr.remove(arr.size()-1);
            }

            return answer;
        }
    }
}
