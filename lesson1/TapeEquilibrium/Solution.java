// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Integer minimal = Integer.MAX_VALUE;

        Integer totalSum = 0;
        Integer leftSum = 0;

        for (int i=0; i<A.length; i++) {
          totalSum += A[i];
        }

        for (int i=0; i<A.length; i++) {

            leftSum = leftSum + A[i];
            Integer rightSum = totalSum - leftSum;

            minimal = Math.min(minimal, Math.abs(leftSum-rightSum));
        }

        return minimal;

    }
}
