package Level1;

import java.util.HashMap;

public class MBTI_Test {
    class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";
            // 성격유형 - 값을 가지는 해쉬 맵 선언
            HashMap<Character, Integer> hash = new HashMap<>();
            hash.put('R', 0);
            hash.put('T', 0);
            hash.put('C', 0);
            hash.put('F', 0);
            hash.put('J', 0);
            hash.put('M', 0);
            hash.put('A', 0);
            hash.put('N', 0);

            // survey 만큼 반복
            for(int i = 0; i < survey.length; i++) {
                // choices 가 1일 때
                if(choices[i] == 1)
                    // hash.put(survey[i].charAt(0), 3);
                    hash.put(survey[i].charAt(0), hash.get(survey[i].charAt(0)) + 3);
                    // choices 가 2일 때
                else if(choices[i] == 2)
                    hash.put(survey[i].charAt(0), hash.get(survey[i].charAt(0)) + 2);
                    // choices 가 3일 때
                else if(choices[i] == 3)
                    hash.put(survey[i].charAt(0), hash.get(survey[i].charAt(0)) + 1);
                    // choices 가 4일 때
                else if(choices[i] == 4)
                    // continue
                    continue;
                    // choices 가 5일 때
                else if(choices[i] == 5)
                    // hash.put(survey[i].charAt(1), 1);
                    hash.put(survey[i].charAt(1), hash.get(survey[i].charAt(1)) + 1);
                    // choices 가 6일 때
                else if(choices[i] == 6)
                    hash.put(survey[i].charAt(1), hash.get(survey[i].charAt(1)) + 2);
                    // choices 가 7일 때
                else
                    hash.put(survey[i].charAt(1), hash.get(survey[i].charAt(1)) + 3);
            }


            // RT 비교(같으면 사전순으로 빠른 것)
            if(hash.get('R') > hash.get('T'))
                answer += "R";
            else if(hash.get('R') < hash.get('T'))
                answer += "T";
            else
                answer += "R".compareTo("T") < 0 ? "R" : "T";
            // CF 비교
            if(hash.get('C') > hash.get('F'))
                answer += "C";
            else if(hash.get('C') < hash.get('F'))
                answer += "F";
            else
                answer += "C".compareTo("F") < 0 ? "C" : "F";
            // JM 비교
            if(hash.get('J') > hash.get('M'))
                answer += "J";
            else if(hash.get('J') < hash.get('M'))
                answer += "M";
            else
                answer += "J".compareTo("M") < 0 ? "J" : "M";
            // AN 비교
            if(hash.get('A') > hash.get('N'))
                answer += "A";
            else if(hash.get('A') < hash.get('N'))
                answer += "N";
            else
                answer += "A".compareTo("N") < 0 ? "A" : "N";
            return answer;
        }
    }
}
