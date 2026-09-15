class Solution {
    public int[] solution(long n) {
        
        String stringN = String.valueOf(n);

        int[] answer = new int[stringN.length()];
        int index = 0;
        

        for (int i = stringN.length() - 1; i >= 0; i--) {
            int intValue = Integer.parseInt(String.valueOf(stringN.charAt(i)));

            answer[index] = intValue;

            index++;
        }

        return answer;
    }
}