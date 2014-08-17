// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A) {
        // write your code in Java SE 8

        int[] response = new int[A.length];

        for (int i=0; i<A.length; i++) {
            int mainNumber = A[i];
            int count = 0;
            for (int j=0; j<A.length; j++) {
                if (i!=j) {
                    if (mainNumber % A[j] != 0) {
                        count++;
                    }
                }
            }
            response[i] = count;
            count = 0;
        }

        return response;

    }
}
