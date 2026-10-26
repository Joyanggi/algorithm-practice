import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String stringN = String.valueOf(n);

        String[] stringArray = new String[stringN.length()];


        for (int i = 0; i < stringN.length(); i++) {
            stringArray[i] = String.valueOf(stringN.charAt(i));
        }

        Arrays.sort(stringArray, Collections.reverseOrder());

        for (int i = 0; i < stringArray.length; i++) {
            answer = answer * 10 + Integer.parseInt(stringArray[i]);
        }

        return answer;
    }
}