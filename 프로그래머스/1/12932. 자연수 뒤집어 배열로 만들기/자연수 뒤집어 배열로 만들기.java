import java.util.*;

class Solution {
    public int[] solution(long n) {
        String stringN = String.valueOf(n);

        int[] answer = new int[stringN.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stringN.charAt(stringN.length() - 1 - i) - '0';
        }

        return answer;
    }
}