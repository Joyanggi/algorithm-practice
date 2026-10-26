class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int countP = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            char charS = s.toLowerCase().charAt(i);

            if (charS == 'p') {
                countP++;
            } else if (charS == 'y') {
                countY++;
            }
        }


        return countP == countY;
    }
}