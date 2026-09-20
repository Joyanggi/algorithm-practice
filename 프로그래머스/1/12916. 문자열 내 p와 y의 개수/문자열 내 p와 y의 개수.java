class Solution {
    boolean solution(String s) {

        boolean answer = true;

        int countP = 0;
        int countY = 0;

        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char charS = Character.toLowerCase(s.charAt(i));
            if (charS == 'p') {
                countP++;
            } else if (charS == 'y') {
                countY++;
            }
        }

        return countP == countY;
    }
}