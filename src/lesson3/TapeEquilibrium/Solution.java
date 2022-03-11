package lesson3.TapeEquilibrium;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long total = 0;
        for (int a : A) {
            total += a;
        }

        long leftTot = 0L;
        long minDifference = Long.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            leftTot = leftTot + A[i];

            long newDiff = Math.abs(leftTot - (total - leftTot));
            if (newDiff < minDifference) {
                minDifference = newDiff;
            }
        }

        return (int)minDifference;
    }
}

class Tester {
    public static void main (String [] args) {
        System.out.println(new Solution().solution(new int[] {-1, -1}));
    }
}