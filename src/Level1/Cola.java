package Level1;

public class Cola {
    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            // 빈병a개를 가져다주면 콜라 b병을 준다
            // n개의 콜라를 가지고 있다
            // 빈병
            // 콜라
            // 콜라가 2개 미만이면 반복을 마친다
            while(n >= a) {
                // 20(n)개의 콜라를 가지고 있고, 2(a)병을 주면 1(b)병을 준다
                // getCola = (n / a) * b -> 받는 콜라의 수
                int getCola = (n / a) * b;
                answer += getCola;

                // n(총 콜라의 수) = n % a(남는 콜라의 수) + getCola(받은 콜라의 수)
                n = (n % a) + getCola;
            }

            return answer;
        }
    }
}
