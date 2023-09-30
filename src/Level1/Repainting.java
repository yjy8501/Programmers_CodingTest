package Level1;

public class Repainting {
    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int paint = 0;

            // section 순회
            for(int area : section) {
                //if(paint < section[i])
                if(paint < area) {
                    // paint = m+section[i] - 1 까지 페인트가 칠해진다
                    paint = m + area - 1;
                    // count++
                    answer++;
                }
                //else 아무것도 안함
            }
            return answer;
        }
    }
}
