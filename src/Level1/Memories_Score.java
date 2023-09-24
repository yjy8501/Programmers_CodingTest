package Level1;

import java.util.*;

public class Memories_Score {

    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            // 이름을 키로, 그리움 점수를 값으로 해쉬를 선언한다
            HashMap<String, Integer> hash = new HashMap();

            for(int i = 0; i < name.length; i++) {
                hash.put(name[i], yearning[i]);
            }

            // photo의 길이 만큼 반복문을 실행한다
            for(int i = 0; i < photo.length; i++) {
                // total 변수를 선언한다
                int total = 0;
                //photo[i]의 길이만큼 반복문을 실행한다
                for(int j = 0; j < photo[i].length; j++) {
                    //photo[i][j]의 값이 해쉬에 있는지 확인하고 값이 있으면 total에 더한다
                    if(hash.containsKey(photo[i][j])) {
                        int value = hash.get(photo[i][j]);
                        total += value;
                    }

                }
                answer[i] = total;
            }

            //answer에 total값을 더해준다
            return answer;
        }
    }
}


