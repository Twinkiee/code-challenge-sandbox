package test;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 1;

        Arrays.sort(A);
        for (int a : A) {
            if (result == a) {
                result++;
            }

        }
        return result;
    }
}
