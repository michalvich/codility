// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for (int i=0; i<A.length-1; i++) {

            if (A[i]+1!=A[i+1]) {
              return A[i]+1;
            }

        }

        return -1;

    }
}
