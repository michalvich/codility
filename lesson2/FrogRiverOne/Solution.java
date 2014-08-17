// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;

class Solution {
    public int solution(int X, int[] A) {

        final Integer finalDestination = X;

        List<Integer> existingItems = new ArrayList<Integer>();

        for (int i=0; i<A.length; i++) {
            Integer value = A[i];
            if (!existingItems.contains(value)) {
                existingItems.add(value);
            }
            if (existingItems.size()+1==finalDestination) {
                return i;
            }
        }

        return -1;

        // write your code in Java SE 8
    }
}
