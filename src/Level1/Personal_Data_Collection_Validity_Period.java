package Level1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Personal_Data_Collection_Validity_Period {
    static  class Solution {
        public static  int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> answer = new ArrayList<>();

            String[] todays = today.split("\\.");
            int[] intToday = Arrays.stream(todays).mapToInt(Integer::parseInt).toArray();
            // terms를 저장한 해쉬
            HashMap<String, Integer> hash = new HashMap();
            // privacies를 저장할 이차원 배열
            String[][] pris = new String[privacies.length][2];

            // terms를 공백으로 나눠 hash에 넣는다
            for(String term : terms) {
                String[] word = term.split(" ");
                hash.put(word[0], Integer.valueOf(word[1]));
            }
            // privacies를 공백 기준으로 나누고, 이차원 배열에 넣어준다
            for(int i = 0; i < privacies.length; i++) {
                pris[i] = privacies[i].split(" ");
            }

            // 이차원 배열을 순회한다
            for(int row = 0; row < pris.length; row++) {
                String[] strStartDay = pris[row][0].split("\\.");
                int[] startDay = Arrays.stream(strStartDay).mapToInt(Integer::parseInt).toArray();
                int[] endDay = new int[3];
                int month = hash.get(pris[row][1]);

                // (일 + 날짜 * 28 - 1) /28 -> 몫은 달에 더하고, 나머지가 일
                int m =  (startDay[2] + (month * 28) - 1) / 28;
                if((startDay[2] + (month * 28) - 1) % 28 == 0) {
                    endDay[2] = 28;
                    m--;
                }
                else
                    endDay[2] = (startDay[2] + (month * 28) - 1) % 28;

                // (달 + 일의 몫) / 12 -> 몫은 년에 더하고, 나머지가 월
                int y = (startDay[1] + m) / 12;
                if((startDay[1] + m) % 12 == 0) {
                    endDay[1] = 12;
                    y--;
                }

                else
                    endDay[1] = (startDay[1] + m) % 12;
                // (년 + 달의 몫)
                endDay[0] = (startDay[0] + y);

                LocalDate localDateToday = LocalDate.of(intToday[0], intToday[1], intToday[2]);
                LocalDate localDateEndDay = LocalDate.of(endDay[0], endDay[1], endDay[2]);

                if(localDateToday.isAfter(localDateEndDay))
                    answer.add(row+1);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();

        }
    }
    public static void main(String[] args) {
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        Solution.solution("2020.01.01",terms,privacies);
    }
}
