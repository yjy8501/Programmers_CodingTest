package Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Str_Slice {
    public int solution(String s) {
        int answer = 0;
        // 어레이리스트를 선언
        int[] list = new int[2];
        list[0] = 0;
        list[1] = 0;

        // 첫번째 문자를 null값으로
        char first = '\0';
        // s만큼 반복한다
        for(int i = 0; i < s.length(); i++) {
            // 첫번째 문자가 x일 경우
            if(first == '\0') {
                // 첫번째 문자에 s.charAt(i)를 저장한다
                first = s.charAt(i);
                // 리스트 0에 1을 넣는다
                list[0] += 1;
            }
            // 첫번째 문자와 s.charAt(i)를 비교한다
            else if(first == s.charAt(i)) {
                // 같으면 리스트 0에 ++
                list[0] += 1;
            }
            // 다르면
            else {
                // 두번째 리스트에 ++
                list[1] += 1;
            }
            // 만약 첫번째 문자와 다른 문자의 나온 숫자가 같으면
            if(list[0] == list[1]) {
                // 결과값 증가
                answer++;
                // 첫번째 문자는 x로 저장
                first = '\0';
                // 리스트는 초기화
                list[0] = 0;
                list[1] = 0;
            }

        }
        if(first != '\0')
            answer++;

        return answer;
    }
}
