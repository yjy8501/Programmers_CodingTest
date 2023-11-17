package Level1;

import java.util.Arrays;

public class Nonexistent_Number_Sum {

    class Solution {
        public int solution(int[] numbers) {
            int answer = -1;
            int total_Sum = 55;

            int sum = Arrays.stream(numbers).sum();

            return total_Sum - sum;
        }
    }
}
