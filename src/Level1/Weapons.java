package Level1;

import java.util.*;
import java.lang.Math;

public class Weapons {

    class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            // number 만큼 반복한다
            for(int i = 1; i <= number; i++) {
                int divisor = 0;
                // i번 만큼 반복한다
                for(int j = 1; j <= Math.sqrt(i); j++) {
                    // i % j == 0 일 때
                    if(i % j == 0) {
                        // Math.pow(j,2) 이면 answer++
                        if(i == Math.pow(j,2))
                            divisor++;
                            //아니면
                        else
                            //answer += 2;
                            divisor += 2;
                    }
                }
                System.out.println(divisor);
                //약수의 개수가 limit보다 초과이면
                if(divisor > limit)
                    // answer += power
                    answer += power;
                    // 아니면
                else
                    // answer += 약수의 개수
                    answer += divisor;
            }

            return answer;
        }
    }
}
