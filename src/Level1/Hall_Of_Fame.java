package Level1;

import java.util.*;
import java.util.stream.IntStream;

public class Hall_Of_Fame {
    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            for(int i = 0; i < score.length; i++) {
                priorityQueue.add(score[i]);
                if(priorityQueue.size() > k)
                    priorityQueue.poll();
                answer[i] = priorityQueue.stream().min(Integer::compareTo).get();
            }

            return answer;
        }
    }
}
