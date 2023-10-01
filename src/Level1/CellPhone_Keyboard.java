package Level1;

import java.util.*;

public class CellPhone_Keyboard {

    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            //해쉬맵을 선언한다
            HashMap<Character, Integer> hash = new HashMap();
            // 키맵을 순회한다
            for(int i = 0; i < keymap.length; i++) {
                for(int j = 0; j < keymap[i].length(); j++) {
                    char alphabet = keymap[i].charAt(j);
                    // System.out.print(alphabet);
                    if(!hash.containsKey(alphabet)) {
                        // 키-알파벳 값-누르는 번수
                        hash.put(alphabet, j+1);
                    }
                    // 이미 키가 있을 경우 더 작은 값을 저장한다
                    else {
                        hash.put(alphabet, Math.min(hash.get(alphabet), j+1));
                    }

                }
            }
            // 타겟을 순회한다
            for(int i = 0; i < targets.length; i++) {
                for(int j = 0; j < targets[i].length(); j++){
                    char alphabet = targets[i].charAt(j);
                    if(!hash.containsKey(alphabet)) {
                        answer[i] = -1;
                        break;
                    }
                    else
                        answer[i] += hash.get(alphabet);
                }
            }
            // 타겟에 있는 키의 값을 더해서 result에 저장
            return answer;
        }
    }
}
