class Solution {
   public int solution(int[] numbers) {
        int sum = 45;

        for (int i = 0; i < numbers.length; i++) {
            if ( 0 <= numbers[i] && numbers[i] <= 9) {
                sum -= numbers[i];
            }
        }

        return sum;
    }
}