import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int previousValue = 1;

        if (A.length>0) {
          Arrays.sort(A);
          for (int i : A) {
            if (previousValue != i) {
              return previousValue;
            }
            previousValue++;
          }
                    
        }

        return previousValue;

    }
}
