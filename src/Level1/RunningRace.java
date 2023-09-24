package Level1;

import java.util.HashMap;
public class RunningRace {

    class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = new String[players.length];
            // 선수들의 이름, 등수를 해쉬 맵에 저장
            HashMap<String, Integer> nameHash = new HashMap<>();
            HashMap<Integer, String> rankHash = new HashMap<>();

            for(int i = 0; i < players.length; i++) {
                nameHash.put(players[i], i);
                rankHash.put(i, players[i]);
            }

            for(String player : callings) {
                // 이름을 통해 등수를 불러온다
                int rank = nameHash.get(player);
                // 등수 -1로 앞에 등수의 선수의 이름을 불러오고, 등수를 +1 해준다
                String frontPlayer = rankHash.get(rank-1);
                nameHash.put(frontPlayer, nameHash.get(frontPlayer)+1);
                nameHash.put(player, nameHash.get(player)-1);
                rankHash.put(rank-1, player);
                rankHash.put(rank, frontPlayer);

            }
            for(int i = 0; i < players.length; i++) {
                answer[i] = rankHash.get(i);
            }

            return answer;
        }

    }
}


