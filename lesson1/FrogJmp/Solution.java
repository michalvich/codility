class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        if (X>=Y) {
            return 0;
        } else if (X+D>=Y) {
            return 1;
        }

        int modulo = (Y-X)%D;

        if (modulo==0) {
            return (Y-X)/D;
        } else {
            return ((Y-X)/D)+1;
        }

    }
}
