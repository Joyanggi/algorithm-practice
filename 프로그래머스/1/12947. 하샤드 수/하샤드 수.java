class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sumNumberX = 0;

        String stringX = String.valueOf(x);

        for (int i = 0; i < stringX.length(); i++) {
            sumNumberX += stringX.charAt(i) - '0';
        }

        if (x % sumNumberX != 0) {
            return false;
        }

        return answer;
    }
}