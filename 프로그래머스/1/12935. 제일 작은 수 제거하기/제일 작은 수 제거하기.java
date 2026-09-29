import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        
        int minIndex = 0;
        
        // arr[1] < arr[0], arr[2] < arr[0]
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}