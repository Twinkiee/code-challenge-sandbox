package lesson3;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        int arrayLength = A.length;
        if (arrayLength == 0) {
            return 1;
        }

        Arrays.sort(A);
        for (int c = 0; c < arrayLength; c++) {
            int requiredValue = c + 1;
            if (A[c] != requiredValue) {
                return requiredValue;
            }
        }

        return arrayLength + 1;
    }

    public static void main (String [] args) {
        System.out.println(new Solution().solution(new int[]{1, 2}));
    }
}
