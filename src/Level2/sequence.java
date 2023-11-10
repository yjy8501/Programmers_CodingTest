package Level2;

public class sequence {
    class Solution {
        public int[] solution(int[] sequence, int k) {
            int[] answer = new int[]{0, sequence.length};
            int left = 0;
            int right = 1;
            int sum = sequence[0];

            while(left < right) {
                if(sum == k) {
                    System.out.print("같다");
                    change(answer, right, left);
                    sum -= sequence[left];
                    left++;
                }
                else if(sum > k) {
                    System.out.print("크다");
                    sum -= sequence[left];
                    left++;
                }
                else if(right < sequence.length) {
                    System.out.print("작다");
                    sum += sequence[right++];
                }
                else {
                    System.out.print("종료");
                    break;
                }

            }

            return answer;
        }
        public void change(int[] answer, int right, int left) {
            if (right - 1 - left < answer[1] - answer[0]) {
                answer[0] = left;
                answer[1] = right - 1;
            }
        }
    }
}
