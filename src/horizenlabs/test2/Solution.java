package horizenlabs.test2;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.math.BigInteger;
import java.util.BitSet;

class Solution {
    public int solution(String S) {

        int result = 0;

        int size = Integer.SIZE - 1;
        for (int i = 0; i < (S.length() / size) + 1; i++) {

            int start = i * size;
            int end = i * size + size;

            if (end - start > S.length() - i * size) {
                end = S.length() ;
            }

            String substring = S.substring(start, end);
            System.out.println("start: " + start + "; end: " + end + "; length: " + substring.length());
            int extracted = extracted(substring);
            System.out.println("result: " + extracted);
            result += extracted;

        }

        return result;
    }

    public int solutionB(String S) {

        int result = 0;

        int size = 3 - 1;
        for (int i = 0; i < (S.length() / size) + 1; i++) {

            int start = i * size;
            int end = i * size + size;

            if (end - start > S.length() - i * size) {
                end = S.length() ;
            }

            String substring = S.substring(start, end);
            System.out.println("start: " + start + "; end: " + end + "; length: " + substring.length());
            int extracted = extracted(substring);
            System.out.println("result: " + extracted);
            result += extracted;
        }

        return result;
    }

    private int extracted(String S) {
        int integer = Integer.parseInt(S, 2);
        // We need the total length of bits
        int totalNumberOfBits = log2(integer);
        byte[] toByteArray = BigInteger.valueOf(integer).toByteArray();
        // We need the total number of bits set to 1
        // cardinality is O(1) complexity
        int totalNumberOfSetBits = BitSet.valueOf(toByteArray).cardinality();
        return integer == 0 ? 0 : totalNumberOfBits + totalNumberOfSetBits - 1;
    }

    public static int log2(int N) {
        return Integer.SIZE - Integer.numberOfLeadingZeros(N);
    }
}



class Tester {
    public static void main (String [] args) {
        System.out.println(new Solution().solution("1111010101111"));
        System.out.println(new Solution().solutionB("1111010101111"));
        System.out.println(new Solution().solution("011100"));
        System.out.println(new Solution().solutionB("011100"));
        System.out.println(new Solution().solution("1110"));
        System.out.println(new Solution().solutionB("1110"));

        StringBuffer s = new StringBuffer();
        for (int i = 1; i <= 64; i++) {
            s.append(1);
        }

        System.out.println(new Solution().solution(s.toString()));
    }
}