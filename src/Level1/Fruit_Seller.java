package Level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fruit_Seller {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            // score를 내림차순으로 정렬한다
            Integer[] list = Arrays.stream(score).boxed().toArray(Integer[]::new);
            Arrays.sort(list, Collections.reverseOrder());
            //i는 m-1부터 m씩 증가, score.length만큼
            for(int i = m-1; i < list.length; i += m) {
                // answer += m * i
                answer += m * list[i];
            }

            return answer;
        }
    }
}
