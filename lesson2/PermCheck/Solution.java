import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int response = 1;
        int previousValue = 1;
        Arrays.sort(A);

        for (int i : A) {
            if (previousValue!=i) {
                return 0;
            }
            previousValue++;
        }

        return response;

    }
}
