package lesson5.MinAvgTwoSlice;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        int[] sums = new int[A.length];
        int result = 0;
        float minSliceAverage = Float.MAX_VALUE;

        for (int x = 0;  x < A.length; x++) {
            sums[x] = A[x];

            for (int y = x + 1; y < A.length; y++) {
                sums[y] = A[y] + sums[y-1];
                float sliceAverage = sums[y] / (float)(y - x + 1);

                if (sliceAverage < minSliceAverage) {
                    result = x;
                    minSliceAverage = sliceAverage;
                }

            }
        }

        return ++result;
    }
}

class Tester {
    public static void main (String [] args) {
        System.out.println(new Solution().solution(new int[]{4, 2, 2, 1, 1}));
        System.out.println(new Solution().solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}

