package Level1;

import java.util.HashMap;

public class Closest_Letter {
    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            HashMap<Character, Integer> alphabet = new HashMap();

            for(int i = 0; i < s.length(); i++) {
                char character = s.charAt(i);
                if(!alphabet.containsKey(character)) {
                    alphabet.put(character, i);
                    answer[i] = -1;
                }
                else {
                    answer[i] = (i - alphabet.get(character));
                    alphabet.put(character, i);
                }
            }

            return answer;
        }
    }
}
