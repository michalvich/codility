// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Integer minimal = Integer.MAX_VALUE;

        Integer firstSum = 0;
        Integer lastSum = 0;

        for (int i=0; i<A.length-1; i++) {

            int[] firstPart = Arrays.copyOfRange(A, 0, i+1);
            int[] lastPart = Arrays.copyOfRange(A, i+1, A.length);

            String data = "";

            for (int j=0; j<firstPart.length; j++) {
                firstSum += firstPart[j];
            }
            data += (", LastPart ");
            for (int j=0; j<lastPart.length; j++) {
                lastSum += lastPart[j];
            }

            minimal = Math.min(minimal, Math.abs(firstSum-lastSum));

            firstSum = 0;
            lastSum = 0;

        }

        return minimal;

    }
}
