package lesson5.CountDiv;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {

        if (A == B) {
            return B % K == 0 ? 1 : 0;
        }

        int result = 0;

        if (A == 0) {
            result = 1;
        }

        if (K == 1) {
            return 1 + B - A;
        }

        return result + ((B / K) - ((A - 1) / K));
    }
}

class Tester {
    public static void main (String [] args) {
        System.out.println(new Solution().solution(1, 2000000000, 1));
    }
}