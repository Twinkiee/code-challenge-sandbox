package lesson4.MissingInteger;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> ints = new HashSet<>();

        for (int a : A) {
            ints.add(a);
        }

        for (int i = 1; i <= 100001; i++) {
            if (!ints.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}

class Tester {
    public static void main (String [] args) {
        System.out.println(new Solution().solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(new Solution().solution(new int[]{1, 2, 3}));
//        System.out.println(new Solution().solution(new int[]{-1, -3}));
//        System.out.println(new Solution().solution(new int[]{1}));
//        System.out.println(new Solution().solution(new int[]{2}));
        System.out.println(new Solution().solution(new int[]{-1, -1, 3, 4}));
//        System.out.println(new Solution().solution(new int[]{-1}));
    }
}