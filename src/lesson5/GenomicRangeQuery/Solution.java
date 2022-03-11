package lesson5.GenomicRangeQuery;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];
        int[] minImpactFactor = new int[S.length()];
        minImpactFactor[0] = S.charAt(0);
        for (int x = 1; x < S.length(); x++) {
            minImpactFactor[x] = Math.min(minImpactFactor[x-1], getImpactFactor(S.charAt(x)));
        }

        for (int i = 0; i < P.length; i++) {
            result[i] = minImpactFactor[Q[i]] - minImpactFactor[P[i]] + getImpactFactor(S.charAt(i));
        }

        return result;
    }

    private int getImpactFactor(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
        }
        return 0;
    }
}


class Tester {
    public static void main (String [] args) {
        System.out.println(Arrays.toString(new Solution().solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
    }
}