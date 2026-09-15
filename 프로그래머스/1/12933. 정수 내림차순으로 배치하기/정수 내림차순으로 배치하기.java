import java.util.*;

class Solution {
     public long solution(long n) {
        long answer = 0;

        String stringN = String.valueOf(n);
        String stringAnswer = "";
        Integer[] arrayInt = new Integer[stringN.length()];

        for (int i = 0; i < stringN.length(); i++) {
            arrayInt[i] = stringN.charAt(i) - '0';
        }
        Arrays.sort(arrayInt, Collections.reverseOrder());

        for (int i = 0; i < arrayInt.length; i++) {
            stringAnswer += Integer.toString(arrayInt[i]);
        }

        answer = Long.parseLong(stringAnswer);

        return answer;
    }
}