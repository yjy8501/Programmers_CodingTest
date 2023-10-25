package Level1;

import java.util.Collections;
import java.util.PriorityQueue;

public class Number_Pair {
    class Solution {
        public String solution(String X, String Y) {
            StringBuffer answer = new StringBuffer("");

            PriorityQueue<Integer> xQueue = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> yQueue = new PriorityQueue<>(Collections.reverseOrder());

            // 두 문자열을 숫자로 바꾼 다음 정렬한다
            for(int i = 0; i < X.length(); i++) {
                xQueue.add(Integer.parseInt(String.valueOf(X.charAt(i))));
            }
            for(int i = 0; i < Y.length(); i++) {
                yQueue.add(Integer.parseInt(String.valueOf(Y.charAt(i))));
            }


            // 두 숫자 모두 크기가 0이 아니여야 한다
            while(!xQueue.isEmpty() && !yQueue.isEmpty()) {
                // 두 앞에 숫자가 같으면 둘다 pop해서 저장
                if(xQueue.peek() == yQueue.peek()) {
                    xQueue.poll();
                    answer.append(yQueue.poll());
                }
                // 두 앞에 숫자가 다르면 큰 숫자만 pop
                else if(xQueue.peek() > yQueue.peek()) {
                    xQueue.poll();
                }
                else {
                    yQueue.poll();
                }
            }

            if(answer.toString().equals("")) {
                answer = new StringBuffer("-1");
            }

            if(answer.charAt(0) == '0')
                answer = new StringBuffer("0");

            return answer.toString();
        }
    }
}
