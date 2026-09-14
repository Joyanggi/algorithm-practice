import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String stringNum = String.valueOf(n);

        for (int i = 0; i < stringNum.length(); i++) {
            answer += Integer.parseInt(String.valueOf(stringNum.charAt(i)));
        }


        return answer;
    }
}