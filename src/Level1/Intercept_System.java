package Level1;

import java.util.*;
import static java.util.Comparator.comparingInt;


public class Intercept_System {
    class Solution {
        public int solution(int[][] targets) {
            int answer = 0;
            int point = 0;
            // 회의실 배정 알고리즘
            // e를 기준으로 오름차준 정렬
            Arrays.sort(targets, comparingInt((int[] target) -> target[1]));
            // 배열의 s와 비교하여 s가 e와 같거나 크면 e를 저장하고 ++,
            for(int[] target : targets) {
                if(target[0] >= point) {
                    point = target[1];
                    System.out.print(target[1]);
                    answer++;
                }
            }
            // e보다 작으면 다음 배열로 넘어간다
            return answer;
        }
    }
}
