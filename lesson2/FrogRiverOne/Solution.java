// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {

        final int finalDestination = X;

        final int[] steps = new int[X+1];

        int count = 0;

        for (int i=0; i<A.length; i++) {
            int value = A[i];
            if (value<=finalDestination && steps[value]==0) {
              steps[value] = 1;
              count++;
            }

            if (count==finalDestination) {
                return i;
            }
        }

        return -1;

        // write your code in Java SE 8
    }
}
