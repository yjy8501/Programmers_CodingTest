package Level1;

import java.lang.StringBuffer;

public class Small_SubString {


    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            StringBuffer buffer = new StringBuffer(t);
            int size = p.length();

            // t- p.length 만큼 반복한다
            for(int i = 0; i <= t.length() - p.length(); i++) {
                // i부터 i + size 까지 슬라이싱해서 p와 비교한다
                String strNum = buffer.substring(i, i+size);
                long num = Long.valueOf(strNum);
                if(num <= Long.valueOf(p))
                    answer++;
            }

            return answer;
        }
    }
}
