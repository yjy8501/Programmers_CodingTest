package Level1;

public class InsufficientFundsCalculator {
    class Solution {
        public long solution(int price, int money, int count) {
            long total_Price = 0;

            for(int i = 1; i <= count; i++) {
                total_Price += price * i;
            }

            if(money - total_Price < 0)
                return total_Price - money;
            else
                return 0;

        }
    }
}
