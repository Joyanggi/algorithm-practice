class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String stringX = String.valueOf(x);

        int y = 0;

        for (int i = 0; i < stringX.length(); i++) {
            int value = stringX.charAt(i) - '0';

            y += value;
        }

        if (x % y == 0) {
            return answer;
        } else {
            answer = false;
        }
        
        return answer;
    }
}