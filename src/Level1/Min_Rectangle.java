package Level1;

import java.util.Arrays;

public class Min_Rectangle {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int maxLeft = 0;
            int maxRight = 0;

            // 한쪽으로 전부 몰아준다
            for(int i = 0; i < sizes.length; i++) {
                if(sizes[i][0] < sizes[i][1]) {
                    int len = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = len;
                }
            }
            // 각 양쪽의 최댓값을 구한다
            for(int i = 0; i < sizes.length; i++) {
                if(sizes[i][0] > maxLeft)
                    maxLeft = sizes[i][0];
                if(sizes[i][1] > maxRight)
                    maxRight = sizes[i][1];
            }

            answer = maxLeft * maxRight;
            return answer;
        }
    }
}
