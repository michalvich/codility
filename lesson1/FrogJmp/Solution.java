class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        if (X>=Y) {
            return 0;
        } else if (X+D>=Y) {
            return 1;
        }

        int distance = Y-X;

        if (distance % D ==0) {
            return distance/D;
        } else {
            return distance/D + 1;
        }

    }
}
