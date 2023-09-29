package Level1;

import java.util.TreeSet;

public class CleanUp_DeskTop {
    class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = new int[4];

            TreeSet<Integer> rowTree = new TreeSet<>();
            TreeSet<Integer> colTree = new TreeSet<>();

            //(행의 가장 작은값, 열의 가장 작은값) | (행의 가장 큰 값, 행의 가장 작은 값)
            for(int i = 0; i < wallpaper.length; i++) {
                for(int j = 0; j < wallpaper[0].length(); j++) {
                    if(wallpaper[i].charAt(j) == '#') {
                        rowTree.add(i);
                        colTree.add(j);
                    }
                }
            }
            // 시작점
            answer[0] = rowTree.first();
            answer[1] = colTree.first();

            // 끝점
            answer[2] = rowTree.last();
            answer[3] = colTree.last();
            //계산하기
            return answer;
        }
    }
}
